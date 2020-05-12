package edu.eci.cvds.bean;

import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.services.ServicesBancoProyectoFactory;
import edu.eci.cvds.services.ServicesUsuario;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.*;


@ManagedBean(name = "prue")
@SessionScoped
@ApplicationScoped

public class Prueba {

    private ServicesUsuario servicesUsuario = ServicesBancoProyectoFactory.getInstance().getServicesUsuario();
    private List<Usuario> pol = new ArrayList<Usuario>();

    public List<Usuario> getKol() {
        return pol;
    }
    public void addkol(String nombre){
        pol.add(new Usuario(nombre,1,nombre,nombre,nombre,nombre,nombre,nombre));
    }

    public void clean() {
        pol.clear();
    }

    public String logIn(String userName, String clave){
        String str="";
        if (servicesUsuario.logIn(userName,clave)== false){
            str="Contraseña o Usuario incorretos";
        }
        return str;
    }


}
