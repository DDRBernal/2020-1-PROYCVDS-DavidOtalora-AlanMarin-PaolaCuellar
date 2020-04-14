package edu.eci.cvds.services;

import edu.eci.cvds.entities.Usuario;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServicesBancoProyecto {
    void insertarUsuario(Usuario usr);

    List<Usuario> getUsuarios();

    Usuario consultarUsuario(String constrasena);

    void setUsuario( String nombre,int documento,String contrasena, String tipoUsuario, String email);
}
