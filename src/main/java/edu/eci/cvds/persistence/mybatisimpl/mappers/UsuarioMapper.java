package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.Usuario;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsuarioMapper {

    Usuario consultarUsuario(@Param("userName") String var1);

    List<Usuario> consultarUsuariosPublico(@Param("userName") String var1);

    Usuario logIn(@Param("userName") String var1, @Param("clave") String var2);

    void insertarUsuario(@Param("usuario") Usuario var1);

}
