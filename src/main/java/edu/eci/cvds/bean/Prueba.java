package edu.eci.cvds.bean;

import edu.eci.cvds.services.ServicesBancoProyectoFactory;
import edu.eci.cvds.services.ServicesUsuario;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "prue")
@SessionScoped
@ApplicationScoped

public class Prueba {

    private ServicesUsuario servicesUsuario = ServicesBancoProyectoFactory.getInstance().getServicesUsuario();

    public String logIn(String userName,String clave){
        String str="";
        if (servicesUsuario.logIn(userName,clave)== false){
            str="Contraseña o Usuario incorretos";
        }
        return str;
    }


}
