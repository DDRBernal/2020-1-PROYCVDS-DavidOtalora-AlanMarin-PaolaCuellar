package edu.eci.cvds.entities;


public class Usuario {
    private String nombre;
    private int documento;
    private String contrasena;
    private String tipoUsuario;
    private String email;

    public Usuario(String nombre, int documento, String contrasena, String tipoUsuario, String email){
        this.nombre=nombre;
        this.documento=documento;
        this.contrasena=contrasena;
        this.tipoUsuario=tipoUsuario;
        this.email=email;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setDocumento(int documento){
        this.documento=documento;
    }

    public void setContrasena(String contrasena){
        this.contrasena=contrasena;
    }

    public void setTipoUsuario(String tipoUsuario){
        this.tipoUsuario=tipoUsuario;
    }

    public void setEmail(String email){
        this.email=email;
    }
}
