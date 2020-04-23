package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.persistence.PersistenceException;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface IniciativaMapper {
    void insertarIniciativa(@Param("nombre") String nombre,@Param("descripcion") String descripcion,@Param("votos") int votos,@Param("fecha") Date fecha,@Param("nombre_proponente") String nombre_proponente,@Param("areas") String areas,@Param("dependencia") String dependencia,@Param("palabras_clave") String palabras_clave) throws PersistenceException;

    void modificarIniciativa(@Param("nombre") String nombre,@Param("descripcion") String descripcion) throws PersistenceException;

    List<Iniciativa> getIniciativas() throws PersistenceException;

    Iniciativa getInfoIniciativa(@Param("nombre") String nombre) throws PersistenceException;
}
