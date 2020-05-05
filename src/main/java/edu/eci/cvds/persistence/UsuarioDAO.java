package edu.eci.cvds.persistence;


import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.Usuario;
import java.util.List;

public interface UsuarioDAO {
    Usuario consultarUsuario(String userName) throws PersistenceException;

    List<Usuario> consultarUsuariosPublico(String userNameLike) throws PersistenceException;

    boolean logIn(String userName, String clave) throws PersistenceException;

    void insertarUsuario(Usuario usuario) throws PersistenceException;

    List<Iniciativa> consultarIniciativasRelacionadas(String userName) throws PersistenceException;
}
