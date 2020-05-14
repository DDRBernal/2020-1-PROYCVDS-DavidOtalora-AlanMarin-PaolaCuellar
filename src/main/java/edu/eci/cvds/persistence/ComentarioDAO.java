package edu.eci.cvds.persistence;

import edu.eci.cvds.entities.Comentario;
import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.Usuario;

import java.sql.Date;
import java.util.List;

public interface ComentarioDAO {
    void comentarUnaIniciativa(Date fecha, String autor, String contenido, String nombreIniciativa, String proponente) throws PersistenceException;

    void eliminarComentario(String autor, Iniciativa iniciativa) throws PersistenceException;

    List<Comentario> consultarComentarios(String iniciativa) throws PersistenceException;
}
