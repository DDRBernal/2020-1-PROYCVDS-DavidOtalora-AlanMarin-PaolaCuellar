package edu.eci.cvds.bean;

import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.services.ServicesBancoProyectoFactory;
import edu.eci.cvds.services.ServicesUsuario;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.util.List;

@ManagedBean(name = "controller")
@SessionScoped
@ApplicationScoped

public class UsuarioPrincipalBean {

    private ServicesUsuario servicesUsuario = ServicesBancoProyectoFactory.getInstance().getServicesUsuario();
    private String user;


    public void regitro(String userName, int documento, String nombre, String apellido, String ocupacion, String clave, String clave2, String tipoUsuario, String email){
        ExternalContext context2 = FacesContext.getCurrentInstance().getExternalContext();
        try {
            if(clave.equals(clave2)) {
                Usuario usuario = new Usuario(userName, documento, nombre, apellido, ocupacion, clave, tipoUsuario, email);
                servicesUsuario.insertarUsuario(usuario);
                context2.redirect(context2.getRequestContextPath() + "/faces/index2.xhtml");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void logIn(String userName,String clave){
        ExternalContext context2 = FacesContext.getCurrentInstance().getExternalContext();
        try {
            if (servicesUsuario.logIn(userName,clave)==true){
                this.user=userName;
                context2.redirect(context2.getRequestContextPath() +"/faces/index3.xhtml");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Usuario getUser() {
        return servicesUsuario.consultarUsuario(user);
    }
}