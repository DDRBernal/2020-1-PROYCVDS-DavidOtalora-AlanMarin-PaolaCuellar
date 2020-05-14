package edu.eci.cvds.bean;

import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.services.ServicesBancoProyectoFactory;
import edu.eci.cvds.services.ServicesUsuario;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.util.List;


@ManagedBean(name = "user")
@SessionScoped
@ApplicationScoped

public class UsuarioBean {
    private ServicesUsuario servicesUsuario = ServicesBancoProyectoFactory.getInstance().getServicesUsuario();
    private String userName;


    public List<Usuario> consultaUsuarios(String buscador){
        return servicesUsuario.consultarUsuariosPublico(buscador);
    }

    public Usuario consultarUsuarioUnico(){
        return servicesUsuario.consultarUsuario(userName);
    }

    public Usuario consultarUsuarioUnico(String user){
        return servicesUsuario.consultarUsuario(user);
    }

    public void setUserName(String userName) {
        try {
            this.userName = userName;
            FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath() + "/faces/index32.xhtml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
