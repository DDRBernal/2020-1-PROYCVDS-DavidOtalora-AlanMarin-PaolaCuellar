package edu.eci.cvds.persistence;

import edu.eci.cvds.entities.PalabraClave;

import java.util.List;

public interface PalabraClaveDAO {
    void agregarPalabrasclave(String palabra, String nombreIniciativa, String proponente) throws PersistenceException;

    void eliminarPalabrasclave(String palabra, String nombreIniciativa, String proponente) throws PersistenceException;

    List<PalabraClave> consultarPalabras(String iniciativa) throws PersistenceException;
}
