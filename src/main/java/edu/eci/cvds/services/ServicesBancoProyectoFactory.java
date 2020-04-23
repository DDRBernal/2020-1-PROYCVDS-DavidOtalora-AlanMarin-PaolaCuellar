package edu.eci.cvds.services;


import com.google.inject.Injector;
import edu.eci.cvds.persistence.IniciativaDAO;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.persistence.mybatisimpl.myBatisIniciativaDAO;
import edu.eci.cvds.persistence.mybatisimpl.myBatisUsuarioDAO;
import org.mybatis.guice.XMLMyBatisModule;

import static com.google.inject.Guice.createInjector;
import java.util.Optional;

public class ServicesBancoProyectoFactory {

    private static ServicesBancoProyectoFactory instance = new ServicesBancoProyectoFactory();

    private static Optional<Injector> optInjector;


    private Injector myBatisInjector(String env, String pathResource) {
        return createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                setEnvironmentId(env);
                setClassPathResource(pathResource);
                bind(UsuarioDAO.class).to(myBatisUsuarioDAO.class);
                bind(IniciativaDAO.class).to(myBatisIniciativaDAO.class);
            }
        });
    }

    public ServicesBancoProyectoFactory() {
        optInjector = Optional.empty();
    }

    public ServicesBancoProyecto getServicesBancoProyecto(){
        if (!optInjector.isPresent()) {
            optInjector = Optional.of(myBatisInjector("development","mybatis-config.xml"));
        }

        return optInjector.get().getInstance(ServicesBancoProyecto.class);
    }


    public ServicesBancoProyecto getServicesBancoProyectoTesting(){
        if (!optInjector.isPresent()) {
            optInjector = Optional.of(myBatisInjector("test","mybatis-config-h2.xml"));
        }

        return optInjector.get().getInstance(ServicesBancoProyecto.class);
    }


    public static ServicesBancoProyectoFactory getInstance(){
        return instance;
    }
}
