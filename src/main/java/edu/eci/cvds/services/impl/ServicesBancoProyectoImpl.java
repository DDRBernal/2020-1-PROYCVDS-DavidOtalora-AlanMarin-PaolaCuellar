package edu.eci.cvds.services.impl;

import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.services.ServicesBancoProyecto;

import java.util.ArrayList;
import java.util.List;

public class ServicesBancoProyectoImpl implements ServicesBancoProyecto {

    private UsuarioDAO usuarioDAO;

    @Override
    public void insertarUsuario(Usuario usr) {
        try {
            usuarioDAO.insertarUsuario(usr);
        }catch (Exception e){
        }
    }

    @Override
    public List<Usuario> getUsuarios() {
        try {
            return usuarioDAO.getUsuarios();
        } catch (Exception e) {
            List<Usuario> exeption = new ArrayList<Usuario>();
            return exeption;
        }
    }

    @Override
    public Usuario consultarUsuario(String constrasena) {
        try {
            return usuarioDAO.consultarUsuario(constrasena);
        } catch (PersistenceException e) {
            Usuario usr = new Usuario("",-1,"","","");
            return usr;
        }
    }

    @Override
    public void setUsuario(String nombre, int documento, String contrasena, String tipoUsuario, String email) {
        try {
            usuarioDAO.setUsuario(nombre, documento, contrasena, tipoUsuario, email);
        } catch (PersistenceException e) {
        }
    }

}
