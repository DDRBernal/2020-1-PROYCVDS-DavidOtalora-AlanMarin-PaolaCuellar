package edu.eci.cvds.persistence.mybatisimpl;

import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.persistence.IniciativaDAO;
import edu.eci.cvds.persistence.PersistenceException;
import com.google.inject.Inject;
import edu.eci.cvds.persistence.mybatisimpl.mappers.IniciativaMapper;

import java.util.Date;
import java.util.List;

public class myBatisIniciativaDAO implements IniciativaDAO {

    @Inject
    private IniciativaMapper iniciativaMapper;

    @Override
    public void insertarIniciativa(String nombre, String descripcion, int votos, Date fecha, String nombre_proponente, String areas, String dependencia, String palabras_clave) throws PersistenceException {
        try {
            iniciativaMapper.insertarIniciativa(nombre,descripcion,votos,fecha,nombre_proponente,areas,dependencia,palabras_clave);
        }catch (Exception e){

        }
    }

    @Override
    public void modificarIniciativa(String nombre, String descripcion) throws PersistenceException {
        try {
            iniciativaMapper.modificarIniciativa(nombre,descripcion);
        }catch (Exception e){

        }
    }

    @Override
    public List<Iniciativa> getIniciativas() throws PersistenceException {
        try {
            return iniciativaMapper.getIniciativas();
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public Iniciativa getInfoIniciativa(String nombre) throws PersistenceException {
        try {
            return iniciativaMapper.getInfoIniciativa(nombre);
        }catch (Exception e){
            return null;
        }
    }
}
