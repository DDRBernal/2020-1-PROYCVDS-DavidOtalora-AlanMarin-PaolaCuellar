package edu.eci.cvds.entities;

public enum Area {
    MATEMATICAS,
    AMBIENTAL,
    SISTEMAS,
    MECANICA,
    INDUSTRIAL,
    FISICA;

    public String toString() {
        return this.name().toLowerCase();
    }
}
