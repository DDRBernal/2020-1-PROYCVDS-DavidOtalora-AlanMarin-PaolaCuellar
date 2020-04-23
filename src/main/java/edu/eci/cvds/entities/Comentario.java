package edu.eci.cvds.entities;

import java.util.Date;

public class Comentario {
    private int id;
    private Date fecha;
    private String autor;
    private String contenido;

    public Comentario(int id, Date fecha, String autor, String contenido){
        this.id = id;
        this.fecha = fecha;
        this.autor = autor;
        this.contenido = contenido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
