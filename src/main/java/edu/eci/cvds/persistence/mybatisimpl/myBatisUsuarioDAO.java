package edu.eci.cvds.persistence.mybatisimpl;

import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.mybatisimpl.mappers.UsuarioMapper;
import com.google.inject.Inject;

import java.util.List;

public class myBatisUsuarioDAO implements UsuarioDAO {
    @Inject
    private UsuarioMapper usuarioMapper;

    @Override
    public void insertarUsuario(Usuario usr) throws PersistenceException {
        try {
            usuarioMapper.insertarUsuario(usr);
        }catch (Exception e){
            throw new PersistenceException("No se logro insertar usuario");
        }
    }

    @Override
    public List<Usuario> getUsuarios() throws PersistenceException {
        try {
            return usuarioMapper.getUsuarios();
        }catch (Exception e){
            throw new PersistenceException("No hay usuarios para mostrar");
        }
    }

    @Override
    public Usuario consultarUsuario(String nombre) throws PersistenceException {
        try {
            return usuarioMapper.consultarUsuario(nombre);
        }catch (Exception e){
            throw new PersistenceException("No se logro consultar usuario");
        }
    }

    @Override
    public void setUsuario(String nombre, int documento, String contrasena, String tipoUsuario, String email) throws PersistenceException {
        try {
            usuarioMapper.setUsuario(nombre,documento,contrasena,tipoUsuario,email);
        }catch (Exception e){
            throw new PersistenceException("No se logro insertar usuario");
        }
    }
}
