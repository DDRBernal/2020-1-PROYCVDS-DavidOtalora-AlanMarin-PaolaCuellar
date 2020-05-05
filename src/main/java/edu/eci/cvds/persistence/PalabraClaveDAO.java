package edu.eci.cvds.persistence;

public interface PalabraClaveDAO {
    void agregarPalabrasclave(String palabra, String nombreIniciativa, String proponente) throws PersistenceException;

    void eliminarPalabrasclave(String palabra, String nombreIniciativa, String proponente) throws PersistenceException;
}
