package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Comentario;
import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.ComentarioDAO;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.mybatisimpl.mappers.ComentarioMapper;

import java.sql.Date;
import java.util.List;

public class MyBatisComentarioDAO implements ComentarioDAO {

    @Inject
    private ComentarioMapper comentarioMapper;

    public void comentarUnaIniciativa(Date fecha, String autor, String contenido, String nombreIniciativa, String proponente) throws PersistenceException {
        try {
            int id = comentarioMapper.consultarALL().size() + 1;
            this.comentarioMapper.comentarUnaIniciativa(id,fecha,autor,contenido,nombreIniciativa,proponente);
        } catch (Exception var3) {
            throw new PersistenceException("No existe usuario o iniciativa");
        }
    }

    public void eliminarComentario(String autor, Iniciativa iniciativa) throws PersistenceException {
        try {
            this.comentarioMapper.eliminarComentario(autor, iniciativa);
        } catch (Exception var4) {
            throw new PersistenceException("Comentario inexistente");
        }
    }

    public List<Comentario> consultarComentarios(String iniciativa) throws PersistenceException {
        try {
            return this.comentarioMapper.consultarComentarios(iniciativa);
        } catch (Exception var3) {
            throw new PersistenceException("Iniciativa no se encuentra");
        }
    }
}
