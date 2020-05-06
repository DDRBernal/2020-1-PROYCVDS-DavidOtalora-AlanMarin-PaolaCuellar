package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.Comentario;
import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.Usuario;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ComentarioMapper {

    void comentarUnaIniciativa(@Param("comentario") Comentario var1);

    void eliminarComentario(@Param("autor") Usuario autor, @Param("iniciativa") Iniciativa iniciativa);

    List<Comentario> consultarComentarios(@Param("iniciativa") Iniciativa iniciativa);
}
