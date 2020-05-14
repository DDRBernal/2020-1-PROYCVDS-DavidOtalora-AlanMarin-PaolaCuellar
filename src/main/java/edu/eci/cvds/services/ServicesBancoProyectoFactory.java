package edu.eci.cvds.services;

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
import edu.eci.cvds.services.impl.ServicesIniciativaImpl;
import edu.eci.cvds.services.impl.ServicesUsuarioImpl;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

public class ServicesBancoProyectoFactory {

    private static ServicesBancoProyectoFactory instance = new ServicesBancoProyectoFactory();
    private static Injector injector;
    private static Injector testInector;

    public ServicesBancoProyectoFactory() {
        injector = Guice.createInjector(new XMLMyBatisModule() {
            protected void initialize() {
                this.install(JdbcHelper.PostgreSQL);
                setEnvironmentId("development");
                this.setClassPathResource("mybatis-config.xml");

                this.bind(ServicesUsuario.class).to(ServicesUsuarioImpl.class);
                this.bind(ServicesIniciativa.class).to(ServicesIniciativaImpl.class);
                this.bind(UsuarioDAO.class).to(MyBatisUsuarioDAO.class);
                this.bind(ComentarioDAO.class).to(MyBatisComentarioDAO.class);
                this.bind(PalabraClaveDAO.class).to(MyBatisPalabraClaveDAO.class);
                this.bind(IniciativaDAO.class).to(MyBatisIniciativaDAO.class);
            }
        });
    }

    public static ServicesBancoProyectoFactory getInstance() {
        return instance;
    }

    public ServicesUsuario getServicesUsuario() {
        return injector.getInstance(ServicesUsuario.class);
    }

    public ServicesIniciativa getServicesIniciativa() {
        return injector.getInstance(ServicesIniciativa.class);
    }

    public IniciativaDAO getDAO() {
        return injector.getInstance(IniciativaDAO.class);
    }
}
