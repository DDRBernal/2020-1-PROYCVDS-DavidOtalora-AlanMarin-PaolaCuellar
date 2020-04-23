package edu.eci.cvds.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Iniciativa implements Serializable {
    private String nombre;
    private String descripcion;
    private int votos;
    private Date fecha;
    private String nombre_proponente;
    private String areas;
    private String dependencia;
    private String palabras_clave;
    private List<Comentario> comentario;

    public Iniciativa(String nombre,String descripcion,int votos,Date fecha,String nombre_proponente,String areas,String dependencia,String palabras_clave,List<Comentario> comentario){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.votos=votos;
        this.fecha=fecha;
        this.nombre_proponente=nombre_proponente;
        this.areas=areas;
        this.dependencia=dependencia;
        this.palabras_clave=palabras_clave;
        this.comentario=comentario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre_proponente() {
        return nombre_proponente;
    }

    public void setNombre_proponente(String nombre_proponente) {
        this.nombre_proponente = nombre_proponente;
    }

    public String getAreas() {
        return areas;
    }

    public void setAreas(String areas) {
        this.areas = areas;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getPalabras_clave() {
        return palabras_clave;
    }

    public void setPalabras_clave(String palabras_clave) {
        this.palabras_clave = palabras_clave;
    }


    public List<Comentario> getComentario() {
        return comentario;
    }

    public void setComentario(List<Comentario> comentario) {
        this.comentario = comentario;
    }
}
