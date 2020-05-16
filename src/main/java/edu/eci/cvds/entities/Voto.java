package edu.eci.cvds.entities;

public class Voto {
    private String votante;
    private String nombreIniciativa;
    private String proponente;

    public void setNombreIniciativa(String nombreIniciativa) {
        this.nombreIniciativa = nombreIniciativa;
    }

    public void setProponente(String proponente) {
        this.proponente = proponente;
    }

    public void setVotante(String votante) {
        this.votante = votante;
    }

    public String getNombreIniciativa() {
        return nombreIniciativa;
    }

    public String getProponente() {
        return proponente;
    }

    public String getVotante() {
        return votante;
    }
}
