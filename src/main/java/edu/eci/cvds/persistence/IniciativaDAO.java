package edu.eci.cvds.persistence;

import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.PalabraClave;
import edu.eci.cvds.entities.Usuario;
import java.util.List;

public interface IniciativaDAO {
    void crearIniciativa(Iniciativa iniciativa) throws PersistenceException;

    Iniciativa consultarIniciativa(String nombreIniciativa) throws PersistenceException;

    List<Iniciativa> consultarPorPalabra(PalabraClave palabraClave) throws PersistenceException;

    List<Iniciativa> consultarPorArea(String area) throws PersistenceException;

    List<Iniciativa> consultarPorEstado(String estado) throws PersistenceException;

    void modificarIniciativaPropietario(Iniciativa iniciativa, String area, String dependencia, String descripcion) throws PersistenceException;

    void modificarIniciativaEstado(Iniciativa iniciativa, String estado) throws PersistenceException;

    void votarPorIniciativa(Usuario usuario, Iniciativa iniciativa) throws PersistenceException;
}
