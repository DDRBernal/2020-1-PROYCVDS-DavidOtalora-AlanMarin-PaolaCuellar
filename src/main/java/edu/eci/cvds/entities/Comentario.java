package edu.eci.cvds.entities;

import java.sql.Date;

public class Comentario {
    private int id;
    private Date fecha;
    private String autor;
    private String contenido;
    private String nombreIniciativa;
    private String proponente;



    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setNombreIniciativa(String nombreIniciativa) {
        this.nombreIniciativa = nombreIniciativa;
    }

    public void setProponente(String proponente) {
        this.proponente = proponente;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public String getAutor() {
        return autor;
    }

    public String getContenido() {
        return this.contenido;
    }

    public String getNombreIniciativa() {
        return this.nombreIniciativa;
    }

    public String getProponente() {
        return this.proponente;
    }

    public int getId() {
        return id;
    }
}
