package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.UsuarioMapper;

import java.util.List;

public class MyBatisUsuarioDAO implements UsuarioDAO {

    @Inject
    private UsuarioMapper usuarioMapper;


    public Usuario consultarUsuario(String userName) throws PersistenceException {
        try {
            return  usuarioMapper.consultarUsuario(userName);
        } catch (Exception var3) {
            throw new PersistenceException("Usuario inexistente");
        }
    }

    public List<Usuario> consultarUsuariosPublico(String userNameLike) throws PersistenceException {
        try {
            return  usuarioMapper.consultarUsuariosPublico(userNameLike);
        } catch (Exception var3) {
            throw new PersistenceException("No existen usuarios similares");
        }
    }

    public boolean logIn(String userName, String clave) throws PersistenceException {
        try {
            Usuario user =  usuarioMapper.logIn(userName, clave);
            boolean boleean = (user.getUserName()==userName && user.getClave()==clave);
            return boleean;
        } catch (Exception var4) {
            throw new PersistenceException("Ingreso incorrecto");
        }
    }

    public void insertarUsuario(Usuario usuario) throws PersistenceException {
        try {
            usuarioMapper.insertarUsuario(usuario);
        } catch (Exception var3) {
            throw new PersistenceException("Ingreso de datos incorrecto");
        }
    }

    public List<Iniciativa> consultarIniciativasRelacionadas(String userName) throws PersistenceException {
        try {
            return  usuarioMapper.consultarIniciativasRelacionadas(userName);
        } catch (Exception var3) {
            throw new PersistenceException("Usuario inexistente");
        }
    }
}
