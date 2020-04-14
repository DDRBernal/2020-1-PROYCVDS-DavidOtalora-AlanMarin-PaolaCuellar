package edu.eci.cvds.services.impl;

import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.services.ServicesBancoProyecto;

public class ServicesBancoProyectoImpl implements ServicesBancoProyecto {

    private UsuarioDAO usuarioDAO;

    @Override
    public void insertarUsuario(Usuario usr) {
        try {
            usuarioDAO.insertarUsuario(usr);
        }catch (Exception e){
        }
    }

}
