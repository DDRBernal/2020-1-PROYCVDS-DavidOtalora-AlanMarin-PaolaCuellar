package edu.eci.cvds.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Comentario;
import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.PalabraClave;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.ComentarioDAO;
import edu.eci.cvds.persistence.IniciativaDAO;
import edu.eci.cvds.persistence.PalabraClaveDAO;
import edu.eci.cvds.services.ServicesBancoProyectoFactory;
import edu.eci.cvds.services.ServicesIniciativa;
import edu.eci.cvds.services.ServicesUsuario;

import java.sql.Date;
import java.util.List;

public class ServicesIniciativaImpl implements ServicesIniciativa {

    @Inject
    private IniciativaDAO iniciativaDAO;

    @Inject
    private PalabraClaveDAO palabraClaveDAO;

    @Inject
    private ComentarioDAO comentarioDAO;


    public void crearIniciativa(String nombreIniciativa, Date fecha, String estado, String proponente, String area, String dependencia, String descripcion) {
        try {
            iniciativaDAO.crearIniciativa(nombreIniciativa,fecha,estado,proponente,area,dependencia,descripcion);
        } catch (Exception var3) {
        }

    }

    public Iniciativa consultarIniciativa(String nombreIniciativa) {
        try {
            return iniciativaDAO.consultarIniciativa(nombreIniciativa);
        } catch (Exception var3) {
            return null;
        }
    }

    @Override
    public List<Iniciativa> consultarIniciativaPublico(String nombreIniciativa) {
        try {
            return iniciativaDAO.consultarIniciativaPublico(nombreIniciativa);
        } catch (Exception var3) {
            return null;
        }
    }

    @Override
    public List<Iniciativa> consultarIniciativasRelacionadas(String userName , String filtro) {
        try {
            return iniciativaDAO.consultarIniciativasRelacionadas(userName, filtro);
        } catch (Exception var3) {
            return null;
        }
    }


    public List<Iniciativa> consultarPorArea(String area) {
        try {
            return iniciativaDAO.consultarPorArea(area);
        } catch (Exception var3) {
            return null;
        }
    }

    public List<Iniciativa> consultarPorEstado(String estado) {
        try {
            return iniciativaDAO.consultarPorEstado(estado);
        } catch (Exception var3) {
            return null;
        }
    }

    @Override
    public List<PalabraClave> consultarPlabras(String iniciativa) {
        try {
            return palabraClaveDAO.consultarPalabras(iniciativa);
        } catch (Exception var3) {
            return null;
        }
    }

    public void modificarIniciativaPropietario(Iniciativa iniciativa, String area, String dependencia, String descripcion) {
        try {
             iniciativaDAO.modificarIniciativaPropietario(iniciativa, area, dependencia, descripcion);
        } catch (Exception var6) {
        }

    }

    public void agregarPalabrasclave(String palabraClave, Iniciativa iniciativa) {
        try {
             palabraClaveDAO.agregarPalabrasclave(palabraClave, iniciativa.getNombreIniciativa(), iniciativa.getProponente());
        } catch (Exception var4) {
        }

    }

    public void eliminarPalabrasclave(String palabraClave, Iniciativa iniciativa) {
        try {
             palabraClaveDAO.eliminarPalabrasclave(palabraClave, iniciativa.getNombreIniciativa(), iniciativa.getProponente());
        } catch (Exception var4) {
        }

    }

    public void modificarIniciativaEstado(Iniciativa iniciativa, String estado) {
        try {
             iniciativaDAO.modificarIniciativaEstado(iniciativa, estado);
        } catch (Exception var4) {
        }

    }



    public void comentarUnaIniciativa(Date fecha, String autor, String contenido, String nombreIniciativa, String proponente) {
        try {

            comentarioDAO.comentarUnaIniciativa(fecha,autor,contenido,nombreIniciativa,proponente);
        } catch (Exception var3) {
        }

    }

    public void eliminarComentario(String autor, Iniciativa iniciativa) {
        try {
             comentarioDAO.eliminarComentario(autor, iniciativa);
        } catch (Exception var4) {
        }

    }

    public List<Comentario> consultarComentarios(String iniciativa) {
        try {
            return  comentarioDAO.consultarComentarios(iniciativa);
        } catch (Exception var3) {
            return null;
        }
    }
}
