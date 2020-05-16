package edu.eci.cvds.bean;

import edu.eci.cvds.entities.*;
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
    private String area;
    private String estado;

    private ServicesIniciativa servicesIniciativa = ServicesBancoProyectoFactory.getInstance().getServicesIniciativa();

    private List<String> plabras= new ArrayList<>();


    public void agregarPalabras1(String Palabra){
        plabras.add(Palabra);
    }

    public void cambiarEstado(){
        try {
        String str;
        if(estado.equals(Estado.EnEsperaDeRevision.getEstado())){
            str=Estado.EnEsperaDeRevision.getBasesDatos();
        }else if(estado.equals(Estado.EnRevision.getEstado())){
            str=Estado.EnRevision.getBasesDatos();
        }else if (estado.equals(Estado.Proyecto.getEstado())){
            str=Estado.Proyecto.getBasesDatos();
        }else {
            str=Estado.Solucionado.getBasesDatos();
        }
        servicesIniciativa.modificarIniciativaEstado(nombreIninciativa,str);
        ExternalContext context2 = FacesContext.getCurrentInstance().getExternalContext();

            this.nombreIninciativa = nombreIninciativa;
            context2.redirect(context2.getRequestContextPath() + "/faces/index4PMO.xhtml");
        }catch (Exception e){
        }

    }

    public void agregarIniciativa(String nombreIniciativa, String proponente, String descripcion){
        ExternalContext context2 = FacesContext.getCurrentInstance().getExternalContext();
        try {
            String str;
            if(area.equals(Area.MATEMATICAS.getArea())){
                str=Area.MATEMATICAS.getArea();
            }else if(area.equals(Area.AMBIENTAL.getArea())){
                str=Area.AMBIENTAL.getArea();
            }else if(area.equals(Area.FISICA.getArea())){
                str=Area.FISICA.getArea();
            }else if(area.equals(Area.INDUSTRIAL.getArea())){
                str=Area.INDUSTRIAL.getArea();
            }else if(area.equals(Area.MECANICA.getArea())){
                str=Area.MECANICA.getArea();
            }else {
                str=Area.SISTEMAS.getArea();
            }
            servicesIniciativa.crearIniciativa(nombreIniciativa, Date.valueOf(LocalDate.now()),"IS",proponente,str,"",descripcion);
            Iniciativa iniciativa=servicesIniciativa.consultarIniciativa(nombreIniciativa);
            for(String p:this.plabras){
                servicesIniciativa.agregarPalabrasclave(p,iniciativa);
            }
            this.plabras.clear();
            context2.redirect(context2.getRequestContextPath() + "/faces/index3.xhtml");
        }catch (Exception e){
        }
    }

    public void votar(String votante){
        String proponente=consultarIniciativaUnica().getProponente();
        servicesIniciativa.votarPorIniciativa(votante,nombreIninciativa,proponente);
    }

    public int consultarVotos(){
        int temp = servicesIniciativa.consultarVotos(nombreIninciativa).size();
        return temp;
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
                    if (!(i.getProponente().equals(inici.getNombreIniciativa()) && i.getProponente().equals(inici.getProponente()))){
                        iniciativaList.add(i);
                    }
                    if (!(j.getProponente().equals(inici.getNombreIniciativa()) && j.getProponente().equals(inici.getProponente()))){
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

    public void setNombreIninciativaUser(String nombreIninciativa) {
        ExternalContext context2 = FacesContext.getCurrentInstance().getExternalContext();
        try {
            this.nombreIninciativa = nombreIninciativa;
            context2.redirect(context2.getRequestContextPath() + "/faces/index4User.xhtml");
        }catch (Exception e){
        }
    }

    public void setNombreIninciativaPMO(String nombreIninciativa) {
        ExternalContext context2 = FacesContext.getCurrentInstance().getExternalContext();
        try {
            this.nombreIninciativa = nombreIninciativa;
            context2.redirect(context2.getRequestContextPath() + "/faces/index4PMO.xhtml");
        }catch (Exception e){
        }
    }

    public String getNombreIninciativa() {
        return nombreIninciativa;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
