package edu.eci.cvds.entities;

import java.io.Serializable;

import java.io.Serializable;

public class Voto implements Serializable {
    private Usuario votante;
    private Iniciativa nombreIniciativa;

    public Voto(Usuario votante, Iniciativa nombreIniciativa) {
        this.votante = votante;
        this.nombreIniciativa = nombreIniciativa;
    }

    public void setVotante(Usuario votante) {
        this.votante = votante;
    }

    public void setNombreIniciativa(Iniciativa nombreIniciativa) {
        this.nombreIniciativa = nombreIniciativa;
    }

    public Usuario getVotante() {
        return this.votante;
    }

    public Iniciativa getNombreIniciativa() {
        return this.nombreIniciativa;
    }
}
