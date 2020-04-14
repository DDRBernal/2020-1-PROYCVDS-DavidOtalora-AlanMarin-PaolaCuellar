package edu.eci.cvds.persistence;


import edu.eci.cvds.entities.Usuario;

import java.util.List;

public interface UsuarioDAO {

    void insertarUsuario(Usuario usr) throws PersistenceException;

    List<Usuario> getUsuarios()throws PersistenceException;

    Usuario consultarUsuario(String contrasena) throws PersistenceException;

    void setUsuario(String nombre, int documento, String contrasena, String tipoUsuario, String email) throws PersistenceException;

}