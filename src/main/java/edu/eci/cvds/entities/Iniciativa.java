package edu.eci.cvds.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class Iniciativa implements Serializable {
    private String nombreIniciativa;
    private Date fecha;
    private String estado;
    private String proponente;
    private String area;
    private String dependencia;
    private String descripcion;


    public void setNombreIniciativa(String nombreIniciativa) {
        this.nombreIniciativa = nombreIniciativa;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setProponente(String proponente) {
        this.proponente = proponente;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    public String getNombreIniciativa() {
        return this.nombreIniciativa;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getProponente() {
        return proponente;
    }

    public String getArea() {
        return this.area;
    }

    public String getDependencia() {
        return this.dependencia;
    }

    public String getDescripcion() {
        return this.descripcion;
    }


    public int getVotos() {
        return 0;
    }//plantear votos
}
