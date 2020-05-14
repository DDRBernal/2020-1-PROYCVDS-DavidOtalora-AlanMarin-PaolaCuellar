package edu.eci.cvds;

import edu.eci.cvds.bean.IniciativaBean;
import edu.eci.cvds.entities.Comentario;
import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.IniciativaDAO;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.services.ServicesBancoProyectoFactory;
import edu.eci.cvds.services.ServicesIniciativa;
import edu.eci.cvds.services.ServicesUsuario;


import java.sql.Date;


public class Main {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("a",123,"a","a","a","a","a","a");

        ServicesUsuario servicesUsuario = ServicesBancoProyectoFactory.getInstance().getServicesUsuario();
        ServicesIniciativa servicesIniciativa = ServicesBancoProyectoFactory.getInstance().getServicesIniciativa();

        Usuario usuario = servicesUsuario.consultarUsuario("DDD");
//        servicesUsuario.insertarUsuario(usuario1);
//        Iniciativa iniciativa = new Iniciativa("ddd",Date.valueOf("2015-03-31"),"ddd","DDD","ddd","ddd","ddd");
//        servicesIniciativa.crearIniciativa(iniciativa);
//        Comentario comentario = new Comentario(Date.valueOf("2015-03-31"),"admin","lol","kol","DDD");
        Iniciativa iniciativa=servicesIniciativa.consultarIniciativa("kol");
//        servicesIniciativa.agregarPalabrasclave("Hipo",iniciativa);
//        servicesIniciativa.agregarPalabrasclave("LOP",iniciativa);
//        servicesIniciativa.comentarUnaIniciativa(Date.valueOf("2015-03-31"),"DDD","ultimocomentar","kol","DDD");
//       servicesIniciativa.crearIniciativa("ddd",Date.valueOf("2015-03-31"),"s","admin","ddd","ddd","ddd");
        System.out.println(servicesIniciativa.consultarIniciativaPublico("ddd"));
    }
}
