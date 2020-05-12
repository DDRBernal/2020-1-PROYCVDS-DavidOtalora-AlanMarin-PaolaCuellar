package edu.eci.cvds.entities;

import java.sql.Date;

public class Comentario {
    private Date fecha;
    private Usuario autor;
    private String contenido;
    private String nombreIniciativa;
    private String proponente;

    public Comentario(Date fecha, Usuario autor, String contenido, String nombreIniciativa, String proponente) {
        this.fecha = fecha;
        this.autor = autor;
        this.contenido = contenido;
        this.nombreIniciativa = nombreIniciativa;
        this.proponente = proponente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
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

    public Usuario getAutor() {
        return this.autor;
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
}
