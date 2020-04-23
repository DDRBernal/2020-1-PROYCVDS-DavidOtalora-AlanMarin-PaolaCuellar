package edu.eci.cvds.persistence;


import edu.eci.cvds.entities.Usuario;

import java.util.List;

public interface UsuarioDAO {

    public void insertarUsuario(Usuario usr) throws PersistenceException;

    public List<Usuario> getUsuarios()throws PersistenceException;

    public Usuario consultarUsuario(String nombre) throws PersistenceException;

    public void setUsuario(String nombre, int documento, String contrasena, String tipoUsuario, String email) throws PersistenceException;

}