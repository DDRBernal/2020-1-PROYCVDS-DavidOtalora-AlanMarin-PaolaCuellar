package edu.eci.cvds.bean;

import edu.eci.cvds.entities.Comentario;
import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.services.ServicesBancoProyectoFactory;
import edu.eci.cvds.services.ServicesIniciativa;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "idea")
@SessionScoped
@ApplicationScoped

public class IniciativaBean {

    private String nombreIninciativa;

    private ServicesIniciativa servicesIniciativa = ServicesBancoProyectoFactory.getInstance().getServicesIniciativa();

    private List<String> plabras= new ArrayList<>();


    public void agregarPalabras1(String Palabra){
        plabras.add(Palabra);
    }

    public void agregarIniciativa(String nombreIniciativa, String proponente, String area, String dependencia, String descripcion){
        ExternalContext context2 = FacesContext.getCurrentInstance().getExternalContext();
        try {
            servicesIniciativa.crearIniciativa(nombreIniciativa, Date.valueOf(LocalDate.now()),"IS",proponente,area,dependencia,descripcion);
            Iniciativa iniciativa=servicesIniciativa.consultarIniciativa(nombreIniciativa);
            for(String p:this.plabras){
                servicesIniciativa.agregarPalabrasclave(p,iniciativa);
            }
            this.plabras.clear();
            context2.redirect(context2.getRequestContextPath() + "/faces/index3.xhtml");
        }catch (Exception e){
        }


    }

    public void comentarIniciativa(String username, String contenido){
        String proponente=consultarIniciativaUnica().getProponente();
        servicesIniciativa.comentarUnaIniciativa(Date.valueOf("2015-03-31"),username,contenido,nombreIninciativa,proponente);
    }

    public List<Iniciativa> consultarInteres(){
        List<Iniciativa> iniciativaList = new ArrayList<Iniciativa>();
        Iniciativa inici=consultarIniciativaUnica();
        List<Iniciativa> area= servicesIniciativa.consultarPorArea(inici.getArea());
        List<Iniciativa> eado= servicesIniciativa.consultarPorEstado(inici.getEstado());
        for (Iniciativa i:eado) {
            for (Iniciativa j:area){
                if(!(i.getNombreIniciativa().equals(j.getNombreIniciativa()) && i.getProponente().equals(j.getProponente()))){
                    if (!(i.equals(inici))){
                        iniciativaList.add(i);
                    }
                    if (!(j.equals(inici))){
                        iniciativaList.add(j);
                    }

                }
            }
        }

        return iniciativaList;
    }

    public Iniciativa consultarIniciativaUnica(){
        return servicesIniciativa.consultarIniciativa(nombreIninciativa);
    }

    public List<Comentario> consultarComentarios(){return  servicesIniciativa.consultarComentarios(nombreIninciativa);}

    public List<Iniciativa> consultarIniciativasRelacionadas(String userName,String buscador){

        return servicesIniciativa.consultarIniciativasRelacionadas(userName,"");
    }

    public void setNombreIninciativa(String nombreIninciativa) {
        ExternalContext context2 = FacesContext.getCurrentInstance().getExternalContext();
        try {
            this.nombreIninciativa = nombreIninciativa;
            context2.redirect(context2.getRequestContextPath() + "/faces/index4.xhtml");
        }catch (Exception e){
        }
    }

    public String getNombreIninciativa() {
        return nombreIninciativa;
    }

}
