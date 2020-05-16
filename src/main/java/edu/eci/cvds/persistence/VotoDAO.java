package edu.eci.cvds.persistence;

import edu.eci.cvds.entities.Voto;

import java.util.List;

public interface VotoDAO {
    void votarPorIniciativa(String votante, String iniciativa, String proponente) throws PersistenceException;

    List<Voto> consultarVotos(String iniciativa) throws PersistenceException;
}
