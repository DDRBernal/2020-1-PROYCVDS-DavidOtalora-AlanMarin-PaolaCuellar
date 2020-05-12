package edu.eci.cvds.entities;

public class PalabraClave {
    private String palabra_clave;
    private String nombreIniciativa;
    private String proponente;

    public PalabraClave(String palabra_clave, String nombreIniciativa, String proponente) {
        this.palabra_clave = palabra_clave;
        this.nombreIniciativa = nombreIniciativa;
        this.proponente = proponente;
    }

    public void setPalabra_clave(String palabra_clave) {
        this.palabra_clave = palabra_clave;
    }

    public void setNombreIniciativa(String nombreIniciativa) {
        this.nombreIniciativa = nombreIniciativa;
    }

    public void setProponente(String proponente) {
        this.proponente = proponente;
    }

    public String getPalabra_clave() {
        return this.palabra_clave;
    }

    public String getNombreIniciativa() {
        return this.nombreIniciativa;
    }

    public String getProponente() {
        return this.proponente;
    }
}
