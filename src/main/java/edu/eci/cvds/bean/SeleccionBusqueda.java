package edu.eci.cvds.bean;

import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.services.ServicesBancoProyectoFactory;
import edu.eci.cvds.services.ServicesIniciativa;
import edu.eci.cvds.services.ServicesUsuario;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.util.List;

@ManagedBean(name = "busqueda")
@SessionScoped
@ApplicationScoped

public class SeleccionBusqueda {
    private String selec;
    private String buscador;

    private ServicesIniciativa servicesIniciativa = ServicesBancoProyectoFactory.getInstance().getServicesIniciativa();



    public List<Iniciativa> consultaIniciativa(){
        List<Iniciativa> iniciativa;

        if (selec.equals("1")){
            iniciativa= servicesIniciativa.consultarIniciativaPublico(buscador);
        }
        else if (selec.equals("2")){
            iniciativa=servicesIniciativa.consultarPorEstado(buscador);
        }else{
            iniciativa=servicesIniciativa.consultarPorArea(buscador);
        }

        return iniciativa;
    }

    public void Busqueda(String buscador){
        ExternalContext context2 = FacesContext.getCurrentInstance().getExternalContext();
        try {
            this.buscador=buscador;
            if (selec.equals("2")){
                context2.redirect(context2.getRequestContextPath() +"/faces/index52.xhtml");
            }else {
                context2.redirect(context2.getRequestContextPath() +"/faces/index5.xhtml");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void BusquedaUsuario(String buscador){
        ExternalContext context2 = FacesContext.getCurrentInstance().getExternalContext();
        try {
            this.buscador=buscador;
            if (selec.equals("2")){
                context2.redirect(context2.getRequestContextPath() +"/faces/index52User.xhtml");
            }else {
                context2.redirect(context2.getRequestContextPath() +"/faces/index5User.xhtml");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void BusquedaPMO(String buscador){
        ExternalContext context2 = FacesContext.getCurrentInstance().getExternalContext();
        try {
            this.buscador=buscador;
            if (selec.equals("2")){
                context2.redirect(context2.getRequestContextPath() +"/faces/index52PMO.xhtml");
            }else {
                context2.redirect(context2.getRequestContextPath() +"/faces/index5PMO.xhtml");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getBuscador() {
        return buscador;
    }

    public void setSelec(String selec) {
        this.selec = selec;
    }

    public String getSelec() {
        return selec;
    }
}

