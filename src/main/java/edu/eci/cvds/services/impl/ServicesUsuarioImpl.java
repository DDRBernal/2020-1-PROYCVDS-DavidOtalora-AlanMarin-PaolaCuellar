package edu.eci.cvds.services.Impl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.services.ServicesUsuario;

import java.util.List;

public class ServicesUsuarioImpl implements ServicesUsuario {

    @Inject
    private UsuarioDAO usuarioDAO;

    @Override
    public Usuario consultarUsuario(String userName) {
        try {
            return usuarioDAO.consultarUsuario(userName);
        } catch (Exception e) {
            return null ;
        }
    }

    @Override
    public List<Usuario> consultarUsuariosPublico(String userNameLike) {
        try {
            return usuarioDAO.consultarUsuariosPublico(userNameLike);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean logIn(String userName, String clave) {
        try {
            return usuarioDAO.logIn(userName,clave);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void insertarUsuario(Usuario usuario) {
        try {
            usuarioDAO.insertarUsuario(usuario);
        } catch (Exception e) {
        }
    }

    @Override
    public List<Iniciativa> consultarIniciativasRelacionadas(String userName) {
        try {
            return usuarioDAO.consultarIniciativasRelacionadas(userName);
        } catch (Exception e) {
            return null;
        }
    }
}
