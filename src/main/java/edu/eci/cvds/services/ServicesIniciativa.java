package edu.eci.cvds.services;

import edu.eci.cvds.entities.Comentario;
import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.PalabraClave;
import edu.eci.cvds.entities.Usuario;

import java.util.List;

public interface ServicesIniciativa {
    void crearIniciativa(Iniciativa iniciativa);

    Iniciativa consultarIniciativa(String nombreIniciativa);

    List<Iniciativa> consultarPorPalabra(PalabraClave palabraClave);

    List<Iniciativa> consultarPorArea(String area);

    List<Iniciativa> consultarPorEstado(String estado);

    void modificarIniciativaPropietario(Iniciativa var1, String var2, String var3, String var4);

    void agregarPalabrasclave(String palabra, Iniciativa iniciativa);

    void eliminarPalabrasclave(String palabra, Iniciativa iniciativa);

    void modificarIniciativaEstado(Iniciativa iniciativa, String estado);

    void votarPorIniciativa(Usuario usuario, Iniciativa iniciativa);

    void comentarUnaIniciativa(Comentario comentario);

    void eliminarComentario(Usuario autor, Iniciativa iniciativa);

    List<Comentario> consultarComentarios(Iniciativa iniciativa);
}
