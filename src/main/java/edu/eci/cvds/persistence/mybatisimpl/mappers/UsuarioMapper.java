package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.Usuario;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsuarioMapper {
    Usuario consultarUsuario(@Param("userName") String var1);

    List<Usuario> consultarUsuariosPublico(@Param("userName") String var1);

    Usuario logIn(@Param("userName") String var1, @Param("clave") String var2);

    void insertarUsuario(@Param("usuario") Usuario var1);

    List<Iniciativa> consultarIniciativasRelacionadas(@Param("userName") String var1);
}