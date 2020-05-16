package edu.eci.cvds.persistence;

import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.PalabraClave;
import edu.eci.cvds.entities.Usuario;

import java.sql.Date;
import java.util.List;

public interface IniciativaDAO {
    void crearIniciativa(String nombreIniciativa, Date fecha, String estado, String proponente, String area, String dependencia, String descripcion) throws PersistenceException;

    Iniciativa consultarIniciativa(String nombreIniciativa) throws PersistenceException;

    List<Iniciativa> consultarIniciativaPublico(String nombreIniciativa) throws PersistenceException;

    List<Iniciativa> consultarPorArea(String area) throws PersistenceException;

    List<Iniciativa> consultarPorEstado(String estado) throws PersistenceException;

    void modificarIniciativaPropietario(Iniciativa iniciativa, String area, String dependencia, String descripcion) throws PersistenceException;

    void modificarIniciativaEstado(String iniciativa, String estado,String proponente) throws PersistenceException;

    List<Iniciativa> consultarIniciativasRelacionadas(String userName,String filtro) throws PersistenceException;


}
