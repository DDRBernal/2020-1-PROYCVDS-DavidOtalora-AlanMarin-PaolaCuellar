package edu.eci.cvds.entities;

public enum TipoUsuario {
    ADMIN("admin"),
    PMO("PMO"),
    PROPONENTE("Proponente"),
    NORMAL("Usuario");

    private final String rol;

    private TipoUsuario(String rol){
        this.rol= rol;
    }

    public String getRol() {
        return rol;
    }
}
