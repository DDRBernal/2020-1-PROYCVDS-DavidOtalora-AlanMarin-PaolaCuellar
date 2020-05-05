package edu.eci.cvds.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Iniciativa implements Serializable {
    private String nombreIniciativa;
    private Date fecha;
    private String estado;
    private Usuario proponente;
    private String area;
    private String dependencia;
    private String descripcion;
    private List<PalabraClave> palabras_clave;
    private List<Comentario> comentarios;
    private int votos;

    public Iniciativa(String nombreIniciativa, Date fecha, String estado, Usuario proponente, String area, String dependencia, String descripcion, List<PalabraClave> palabras_clave, List<Comentario> comentarios, int votos) {
        this.nombreIniciativa = nombreIniciativa;
        this.fecha = fecha;
        this.estado = estado;
        this.proponente = proponente;
        this.area = area;
        this.dependencia = dependencia;
        this.descripcion = descripcion;
        this.palabras_clave = palabras_clave;
        this.comentarios = comentarios;
        this.votos = votos;
    }

    public void setNombreIniciativa(String nombreIniciativa) {
        this.nombreIniciativa = nombreIniciativa;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setProponente(Usuario proponente) {
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

    public void setPalabras_clave(List<PalabraClave> palabras_clave) {
        this.palabras_clave = palabras_clave;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public void setVotos(int votos) {
        this.votos = votos;
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

    public Usuario getProponente() {
        return this.proponente;
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

    public List<PalabraClave> getPalabras_clave() {
        return this.palabras_clave;
    }

    public List<Comentario> getComentarios() {
        return this.comentarios;
    }

    public int getVotos() {
        return this.votos;
    }
}
