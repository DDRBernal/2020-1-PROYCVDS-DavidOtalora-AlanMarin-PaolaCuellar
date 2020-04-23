package edu.eci.cvds.services;

import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.Usuario;

import edu.eci.cvds.persistence.PersistenceException;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServicesBancoProyecto {
    void insertarUsuario(Usuario usr) throws  ServicesBancoProyectoException;

    List<Usuario> getUsuarios() throws ServicesBancoProyectoException;

    Usuario consultarUsuario(String nombre) throws ServicesBancoProyectoException;

    void setUsuario(String nombre, int documento, String contrasena, String tipoUsuario, String email) throws ServicesBancoProyectoException;
}
