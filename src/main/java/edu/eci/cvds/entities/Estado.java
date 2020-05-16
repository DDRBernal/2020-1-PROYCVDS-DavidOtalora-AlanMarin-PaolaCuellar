package edu.eci.cvds.entities;

public enum Estado {
    EnEsperaDeRevision("enesperaderevision","EE"),
    EnRevision("enrevision","ER"),
    Proyecto("proyecto","PR"),
    Solucionado("solucionado","SO");

    public final String estado;
    public final String BasesDatos;

    private Estado(String estado,String BasesDatos){
        this.estado=estado;
        this.BasesDatos=BasesDatos;
    }

    public String getEstado(){
        return estado;
    }

    public String getBasesDatos() {
        return BasesDatos;
    }
}
