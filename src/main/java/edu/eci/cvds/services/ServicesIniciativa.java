package edu.eci.cvds.services;

import edu.eci.cvds.entities.Comentario;
import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.PalabraClave;
import edu.eci.cvds.entities.Usuario;
import java.util.List;

public interface ServicesIniciativa {
    void crearIniciativa(Iniciativa var1);

    Iniciativa consultarIniciativa(String var1);

    List<Iniciativa> consultarPorPalabra(PalabraClave var1);

    List<Iniciativa> consultarPorArea(String var1);

    List<Iniciativa> consultarPorEstado(String var1);

    void modificarIniciativaPropietario(Iniciativa var1, String var2, String var3, String var4);

    void agregarPalabrasclave(String var1, Iniciativa var2);

    void eliminarPalabrasclave(String var1, Iniciativa var2);

    void modificarIniciativaEstado(Iniciativa var1, String var2);

    void votarPorIniciativa(Usuario var1, Iniciativa var2);

    void comentarUnaIniciativa(Comentario var1);

    void eliminarComentario(Usuario var1, Iniciativa var2);

    List<Comentario> consultarComentarios(Iniciativa var1);
}
