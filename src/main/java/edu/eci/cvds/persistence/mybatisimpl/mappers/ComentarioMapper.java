package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.Comentario;
import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.Usuario;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;

public interface ComentarioMapper {

    void comentarUnaIniciativa(@Param("id")int id,@Param("fecha") Date fecha, @Param("autor")String autor, @Param("contenido")String contenido, @Param("nombreIniciativa")String nombreIniciativa, @Param("proponente")String proponente);

    void eliminarComentario(@Param("autor") String autor, @Param("iniciativa") Iniciativa iniciativa);

    List<Comentario> consultarComentarios(@Param("iniciativa") String iniciativa);

    List<Comentario> consultarALL();
}
