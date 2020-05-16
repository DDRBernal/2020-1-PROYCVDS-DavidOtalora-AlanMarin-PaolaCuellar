package edu.eci.cvds.entities;

public enum Area {
    MATEMATICAS("matematicas"),
    AMBIENTAL("ambiental"),
    SISTEMAS("sistemas"),
    MECANICA("mecanica"),
    INDUSTRIAL("industrial"),
    FISICA("fisica");

    private final String area;

    private Area(String area){
        this.area= area;
    }

    public String getArea() {
        return area;
    }
}
