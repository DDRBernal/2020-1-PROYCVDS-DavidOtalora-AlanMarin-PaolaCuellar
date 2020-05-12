package edu.eci.cvds.entities;

public class Usuario {
    private String userName;
    private int documento;
    private String nombre;
    private String apellido;
    private String ocupacion;
    private String clave;
    private String tipoUsuario;
    private String email;

    public Usuario(String userName, int documento, String nombre, String apellido, String ocupacion, String clave, String tipoUsuario, String email){
        this.userName = userName;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.clave = clave;
        this.tipoUsuario = tipoUsuario;
        this.email = email;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getUserName() {
        return this.userName;
    }

    public int getDocumento() {
        return this.documento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getOcupacion() {
        return this.ocupacion;
    }

    public String getClave() {
        return this.clave;
    }

    public String getTipoUsuario() {
        return this.tipoUsuario;
    }

    public String getEmail() {
        return this.email;
    }

}
