package edu.eci.cvds;

import edu.eci.cvds.bean.IniciativaBean;
import edu.eci.cvds.entities.*;
import edu.eci.cvds.persistence.IniciativaDAO;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.services.ServicesBancoProyectoFactory;
import edu.eci.cvds.services.ServicesIniciativa;
import edu.eci.cvds.services.ServicesUsuario;


import java.sql.Date;
import java.util.List;


public class Main {

    public static void main(String[] args) {


        ServicesUsuario servicesUsuario = ServicesBancoProyectoFactory.getInstance().getServicesUsuario();
        ServicesIniciativa servicesIniciativa = ServicesBancoProyectoFactory.getInstance().getServicesIniciativa();

//        Usuario usuario = servicesUsuario.consultarUsuario("DDD");
////        servicesUsuario.insertarUsuario(usuario1);
////        Iniciativa iniciativa = new Iniciativa("ddd",Date.valueOf("2015-03-31"),"ddd","DDD","ddd","ddd","ddd");
////        servicesIniciativa.crearIniciativa(iniciativa);
////        Comentario comentario = new Comentario(Date.valueOf("2015-03-31"),"admin","lol","kol","DDD");
//        Iniciativa iniciativa=servicesIniciativa.consultarIniciativa("kol");
////        servicesIniciativa.agregarPalabrasclave("Hipo",iniciativa);
////        servicesIniciativa.agregarPalabrasclave("LOP",iniciativa);
////        servicesIniciativa.comentarUnaIniciativa(Date.valueOf("2015-03-31"),"DDD","ultimocomentar","kol","DDD");
////       servicesIniciativa.crearIniciativa("ddd",Date.valueOf("2015-03-31"),"s","admin","ddd","ddd","ddd");
//
//        List<Iniciativa> ksks= ServicesBancoProyectoFactory.getInstance().getDAO().consultarIniciativaPublico("kol");
//        Usuario usuario1 = new Usuario("z",99999,"z","z","z","z","z","z");
//        servicesUsuario.insertarUsuario(usuario1);
        //servicesIniciativa.votarPorIniciativa("admin","look","admin");

        System.out.println(servicesIniciativa.consultarVotos("look").get(0));
    }
}
