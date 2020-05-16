package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Voto;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.VotoDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.VotoMapper;

import java.util.List;

public class MyBatisVotoDAO implements VotoDAO {

    @Inject
    private VotoMapper votoMapper;


    @Override
    public void votarPorIniciativa(String votante, String iniciativa, String proponente) throws PersistenceException {
        try {
            votoMapper.votarPorIniciativa(votante,iniciativa,proponente);
        }catch (Exception e){
         throw new PersistenceException("Usuario inexistente");
        }
    }

    @Override
    public List<Voto> consultarVotos(String iniciativa)throws PersistenceException  {
        try{
            return votoMapper.consultarVotos(iniciativa);
        }catch (Exception e){
            throw new PersistenceException("Iniciativa inexistente");
        }
    }
}
