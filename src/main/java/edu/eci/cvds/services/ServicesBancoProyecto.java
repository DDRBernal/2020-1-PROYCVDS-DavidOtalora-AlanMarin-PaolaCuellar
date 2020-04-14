package edu.eci.cvds.services;

import edu.eci.cvds.entities.Usuario;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServicesBancoProyecto {
    void insertarUsuario(@Param("usuario") Usuario usr);

    List<Usuario> getUsuarios();

    Usuario consultarUsuario(@Param("contrasena") String constrasena);

    void setUsuario(@Param("nombre") String nombre,@Param("documento") int documento,@Param("contrasena") String contrasena,@Param("tipoUsuario") String tipoUsuario,@Param("email") String email);
}
