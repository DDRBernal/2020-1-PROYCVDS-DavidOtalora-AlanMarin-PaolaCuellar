package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Comentario;
import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.ComentarioDAO;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.mybatisimpl.mappers.ComentarioMapper;

import java.util.List;

public class MyBatisComentarioDAO implements ComentarioDAO {

    @Inject
    private ComentarioMapper comentarioMapper;

    public void comentarUnaIniciativa(Comentario comentario) throws PersistenceException {
        try {
            this.comentarioMapper.comentarUnaIniciativa(comentario);
        } catch (Exception var3) {
            throw new PersistenceException("No existe usuario o iniciativa");
        }
    }

    public void eliminarComentario(Usuario autor, Iniciativa iniciativa) throws PersistenceException {
        try {
            this.comentarioMapper.eliminarComentario(autor, iniciativa);
        } catch (Exception var4) {
            throw new PersistenceException("Comentario inexistente");
        }
    }

    public List<Comentario> consultarComentarios(Iniciativa iniciativa) throws PersistenceException {
        try {
            return this.comentarioMapper.consultarComentarios(iniciativa);
        } catch (Exception var3) {
            throw new PersistenceException("Iniciativa no se encuentra");
        }
    }
}
