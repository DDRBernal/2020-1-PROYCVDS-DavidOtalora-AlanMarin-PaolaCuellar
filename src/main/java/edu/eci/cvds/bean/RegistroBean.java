package edu.eci.cvds.bean;

import edu.eci.cvds.entities.Usuario;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "sem")
@SessionScoped
@ApplicationScoped
public class RegistroBean {
    private  int res=9;
    private Usuario selecto;


    public void nuevoUsuario(String nombre, int documento, String contrasena, String tipoUsuario, String email){

        try {

        }catch (Exception e){}
    }



    public String sum(int num ){
        res = num +3;
        String ff = "tu numero es: "+ Integer.toString(res);
        return ff;
    }

}
