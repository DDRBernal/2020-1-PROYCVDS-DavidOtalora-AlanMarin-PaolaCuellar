package edu.eci.cvds.services;


import com.google.inject.Injector;
import org.mybatis.guice.XMLMyBatisModule;

import static com.google.inject.Guice.createInjector;
import java.util.Optional;

public class ServicesBancoProyectoFactory {

    private ServicesBancoProyectoFactory instance = new ServicesBancoProyectoFactory();

    private static Optional<Injector> optInjector;

    private static Injector injector;
    private static Injector testInector;

    public ServicesBancoProyectoFactory() {
        //injector = createInjector(new XMLMyBatisModule() {

        //}
    }


}
