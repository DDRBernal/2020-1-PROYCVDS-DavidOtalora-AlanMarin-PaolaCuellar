package edu.eci.cvds.persistence;


import edu.eci.cvds.entities.Usuario;

public interface UsuarioDAO {

    public void insertarUsuario(Usuario usr) throws PersistenceException;

}