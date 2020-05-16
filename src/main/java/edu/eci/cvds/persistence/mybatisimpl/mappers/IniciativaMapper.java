package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.PalabraClave;
import edu.eci.cvds.entities.Usuario;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;

public interface IniciativaMapper {

    void crearIniciativa(@Param("nombreIniciativa")String nombreIniciativa, @Param("fecha") Date fecha, @Param("estado")String estado, @Param("proponente")String proponente, @Param("area")String area, @Param("dependencia")String dependencia, @Param("descripcion")String descripcion);

    Iniciativa consultarIniciativa(@Param("nombreIniciativa") String nombreIniciativa);

    List<Iniciativa> consultarIniciativaPublico(@Param("nombreIniciativa") String nombreIniciativa);

    List<Iniciativa> consultarIniciativasRelacionadas(@Param("userName") String var1,@Param("filtro")String filtro);

    List<Iniciativa> consultarPorArea(@Param("area")String var1);

    List<Iniciativa> consultarPorEstado(@Param("estado")String var1);

    void modificarIniciativaPropietario(Iniciativa var1, String var2, String var3, String var4);

    void modificarIniciativaEstado(@Param("iniciativa")String var1, @Param("estado")String var2,@Param("proponente") String proponente);

}
