package edu.eci.cvds.persistence;

import edu.eci.cvds.entities.Comentario;
import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.Usuario;

import java.util.List;

public interface ComentarioDAO {
    void comentarUnaIniciativa(Comentario comentario) throws PersistenceException;

    void eliminarComentario(Usuario autor, Iniciativa iniciativa) throws PersistenceException;

    List<Comentario> consultarComentarios(Iniciativa iniciativa) throws PersistenceException;
}
