package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.PalabraClave;
import edu.eci.cvds.entities.Usuario;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IniciativaMapper {
    void crearIniciativa(@Param("iniciativa") Iniciativa var1);

    Iniciativa consultarIniciativa(@Param("nombreIniciativa") String nombreIniciativa);

    List<Iniciativa> consultarPorPalabra(PalabraClave var1);

    List<Iniciativa> consultarPorArea(@Param("area")String var1);

    List<Iniciativa> consultarPorEstado(@Param("estado")String var1);

    void modificarIniciativaPropietario(Iniciativa var1, String var2, String var3, String var4);

    void modificarIniciativaEstado(@Param("iniciativa")Iniciativa var1, @Param("estado")String var2);

    void votarPorIniciativa(Usuario var1, Iniciativa var2);
}
