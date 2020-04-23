package edu.eci.cvds.persistence;

import edu.eci.cvds.entities.Iniciativa;

import java.util.Date;
import java.util.List;

public interface IniciativaDAO {

    void insertarIniciativa(String nombre, String descripcion, int votos, Date fecha, String nombre_proponente, String areas, String dependencia, String palabras_clave) throws PersistenceException;

    void modificarIniciativa(String nombre,String descripcion) throws PersistenceException;

    List<Iniciativa> getIniciativas() throws PersistenceException;

    Iniciativa getInfoIniciativa(String nombre) throws PersistenceException;




}
