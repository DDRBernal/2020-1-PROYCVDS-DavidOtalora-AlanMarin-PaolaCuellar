package edu.eci.cvds.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import edu.eci.cvds.persistence.ComentarioDAO;
import edu.eci.cvds.persistence.IniciativaDAO;
import edu.eci.cvds.persistence.PalabraClaveDAO;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisComentarioDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisIniciativaDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisPalabraClaveDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisUsuarioDAO;
import edu.eci.cvds.services.ServicesIniciativa;
import edu.eci.cvds.services.ServicesUsuario;
import edu.eci.cvds.services.impl.ServicesIniciativaImpl;
import edu.eci.cvds.services.impl.ServicesUsuarioImpl;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

public class GuiceContextListener implements ServletContextListener {
    public GuiceContextListener() {
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.removeAttribute(Injector.class.getName());
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Injector injector = Guice.createInjector(new Module[]{new XMLMyBatisModule() {
            protected void initialize() {
                this.install(JdbcHelper.PostgreSQL);
                this.setEnvironmentId("development");
                this.setClassPathResource("mybatis-config.xml");
                this.bind(ServicesUsuario.class).to(ServicesUsuarioImpl.class);
                this.bind(ServicesIniciativa.class).to(ServicesIniciativaImpl.class);
                this.bind(UsuarioDAO.class).to(MyBatisUsuarioDAO.class);
                this.bind(ComentarioDAO.class).to(MyBatisComentarioDAO.class);
                this.bind(PalabraClaveDAO.class).to(MyBatisPalabraClaveDAO.class);
                this.bind(IniciativaDAO.class).to(MyBatisIniciativaDAO.class);
            }
        }});
        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.setAttribute(Injector.class.getName(), injector);
    }
}
