package edu.eci.cvds.services;

import edu.eci.cvds.entities.Comentario;
import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.PalabraClave;
import edu.eci.cvds.entities.Usuario;

import java.sql.Date;
import java.util.List;

public interface ServicesIniciativa {
    void crearIniciativa(String nombreIniciativa, Date fecha, String estado, String proponente, String area, String dependencia, String descripcion);

    Iniciativa consultarIniciativa(String nombreIniciativa);

    List<Iniciativa> consultarIniciativaPublico(String nombreIniciativa);

    List<Iniciativa> consultarIniciativasRelacionadas(String userName, String filtro);

    List<Iniciativa> consultarPorArea(String area);

    List<Iniciativa> consultarPorEstado(String estado);

    List<PalabraClave> consultarPlabras(String iniciativa);

    void modificarIniciativaPropietario(Iniciativa var1, String var2, String var3, String var4);

    void agregarPalabrasclave(String palabra, Iniciativa iniciativa);

    void eliminarPalabrasclave(String palabra, Iniciativa iniciativa);

    void modificarIniciativaEstado(Iniciativa iniciativa, String estado);

//    void votarPorIniciativa(Usuario usuario, Iniciativa iniciativa);

    void comentarUnaIniciativa(Date fecha, String autor, String contenido, String nombreIniciativa, String proponente);

    void eliminarComentario(String autor, Iniciativa iniciativa);

    List<Comentario> consultarComentarios(String iniciativa);
}
