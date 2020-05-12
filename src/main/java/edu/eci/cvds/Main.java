package edu.eci.cvds;

import edu.eci.cvds.entities.Comentario;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.services.ServicesBancoProyectoFactory;
import edu.eci.cvds.services.ServicesUsuario;


import java.sql.Date;


public class Main {

    public static void main(String[] args) {
//        Usuario usuario = new Usuario("a",0,"a","a","a","a","a","a");
//        Comentario comentario = new Comentario(Date.valueOf("2015-03-31"),usuario,"","","");

        ServicesUsuario servicesUsuario = ServicesBancoProyectoFactory.getInstance().getServicesUsuario();
        System.out.println(servicesUsuario.consultarUsuariosPublico("admin").size());
    }
}
