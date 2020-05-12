package edu.eci.cvds.persistence.mybatisimpl.mappers;

import org.apache.ibatis.annotations.Param;

public interface PalabraClaveMapper {
    void agregarPalabrasclave(@Param("palabra") String var1, @Param("nombreIniciativa") String var2, @Param("proponente") String var3);

    void eliminarPalabrasclave(@Param("palabra") String var1, @Param("nombreIniciativa") String var2, @Param("proponente") String var3);
}
