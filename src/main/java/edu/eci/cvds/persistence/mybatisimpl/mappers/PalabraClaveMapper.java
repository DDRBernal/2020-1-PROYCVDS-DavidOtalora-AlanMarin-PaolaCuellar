package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.PalabraClave;
import edu.eci.cvds.persistence.PersistenceException;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PalabraClaveMapper {
    void agregarPalabrasclave(@Param("palabra") String var1, @Param("nombreIniciativa") String var2, @Param("proponente") String var3);

    void eliminarPalabrasclave(@Param("palabra") String var1, @Param("nombreIniciativa") String var2, @Param("proponente") String var3);

    List<PalabraClave> consultarPlabras(@Param("nombreIniciativa")String iniciativa) throws PersistenceException;
}
