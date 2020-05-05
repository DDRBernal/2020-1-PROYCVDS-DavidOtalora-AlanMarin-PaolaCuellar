package edu.eci.cvds.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Comentario;
import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.PalabraClave;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.ComentarioDAO;
import edu.eci.cvds.persistence.IniciativaDAO;
import edu.eci.cvds.persistence.PalabraClaveDAO;
import edu.eci.cvds.services.ServicesIniciativa;
import java.util.List;

public class ServicesIniciativaImpl implements ServicesIniciativa {
    @Inject
    private IniciativaDAO iniciativaDAO;
    @Inject
    private PalabraClaveDAO palabraClaveDAO;
    @Inject
    private ComentarioDAO comentarioDAO;

    public ServicesIniciativaImpl() {
    }

    public void crearIniciativa(Iniciativa iniciativa) {
        try {
            this.iniciativaDAO.crearIniciativa(iniciativa);
        } catch (Exception var3) {
        }

    }

    public Iniciativa consultarIniciativa(String nombreIniciativa) {
        try {
            return this.iniciativaDAO.consultarIniciativa(nombreIniciativa);
        } catch (Exception var3) {
            return null;
        }
    }

    public List<Iniciativa> consultarPorPalabra(PalabraClave palabraClave) {
        try {
            return this.iniciativaDAO.consultarPorPalabra(palabraClave);
        } catch (Exception var3) {
            return null;
        }
    }

    public List<Iniciativa> consultarPorArea(String area) {
        try {
            return this.iniciativaDAO.consultarPorArea(area);
        } catch (Exception var3) {
            return null;
        }
    }

    public List<Iniciativa> consultarPorEstado(String estado) {
        try {
            return this.iniciativaDAO.consultarPorEstado(estado);
        } catch (Exception var3) {
            return null;
        }
    }

    public void modificarIniciativaPropietario(Iniciativa iniciativa, String area, String dependencia, String descripcion) {
        try {
            this.iniciativaDAO.modificarIniciativaPropietario(iniciativa, area, dependencia, descripcion);
        } catch (Exception var6) {
        }

    }

    public void agregarPalabrasclave(String palabraClave, Iniciativa iniciativa) {
        try {
            this.palabraClaveDAO.agregarPalabrasclave(palabraClave, iniciativa.getNombreIniciativa(), iniciativa.getProponente().getUserName());
        } catch (Exception var4) {
        }

    }

    public void eliminarPalabrasclave(String palabraClave, Iniciativa iniciativa) {
        try {
            this.palabraClaveDAO.eliminarPalabrasclave(palabraClave, iniciativa.getNombreIniciativa(), iniciativa.getProponente().getUserName());
        } catch (Exception var4) {
        }

    }

    public void modificarIniciativaEstado(Iniciativa iniciativa, String estado) {
        try {
            this.iniciativaDAO.modificarIniciativaEstado(iniciativa, estado);
        } catch (Exception var4) {
        }

    }

    public void votarPorIniciativa(Usuario usuario, Iniciativa iniciativa) {
        try {
            this.iniciativaDAO.votarPorIniciativa(usuario, iniciativa);
        } catch (Exception var4) {
        }

    }

    public void comentarUnaIniciativa(Comentario comentario) {
        try {
            this.comentarioDAO.comentarUnaIniciativa(comentario);
        } catch (Exception var3) {
        }

    }

    public void eliminarComentario(Usuario autor, Iniciativa iniciativa) {
        try {
            this.comentarioDAO.eliminarComentario(autor, iniciativa);
        } catch (Exception var4) {
        }

    }

    public List<Comentario> consultarComentarios(Iniciativa iniciativa) {
        try {
            return this.comentarioDAO.consultarComentarios(iniciativa);
        } catch (Exception var3) {
            return null;
        }
    }
}
