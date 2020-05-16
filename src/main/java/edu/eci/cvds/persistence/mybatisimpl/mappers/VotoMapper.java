package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.Voto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VotoMapper {

    void votarPorIniciativa(@Param("votante")String votante, @Param("iniciativa")String iniciativa, @Param("proponente")String proponente);

    List<Voto> consultarVotos(@Param("iniciativa")String iniciativa);

}
