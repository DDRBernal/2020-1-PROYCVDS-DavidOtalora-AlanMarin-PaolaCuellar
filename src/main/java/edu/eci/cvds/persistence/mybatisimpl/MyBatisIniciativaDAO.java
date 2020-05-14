package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.PalabraClave;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.ComentarioDAO;
import edu.eci.cvds.persistence.IniciativaDAO;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.mybatisimpl.mappers.IniciativaMapper;

import java.sql.Date;
import java.util.List;

public class MyBatisIniciativaDAO implements IniciativaDAO {

    @Inject
    private IniciativaMapper iniciativaMapper;

    public void crearIniciativa(String nombreIniciativa, Date fecha, String estado, String proponente, String area, String dependencia, String descripcion) throws PersistenceException {
        try {
            this.iniciativaMapper.crearIniciativa(nombreIniciativa,fecha,estado,proponente,area,dependencia,descripcion);
        } catch (Exception e) {
            throw new PersistenceException("Ingreso de datos incorrecto");
        }
    }

    public Iniciativa consultarIniciativa(String nombreIniciativa) throws PersistenceException {
        try {
            return this.iniciativaMapper.consultarIniciativa(nombreIniciativa);
        } catch (Exception e) {
            throw new PersistenceException("Iniciativa inexitente");
        }
    }

    @Override
    public List<Iniciativa> consultarIniciativaPublico(String nombreIniciativa) throws PersistenceException {
        try {
            String string= "%"+nombreIniciativa+"%";
            return this.iniciativaMapper.consultarIniciativaPublico(string);
        } catch (Exception e) {
            throw new PersistenceException("Iniciativa inexitente");
        }
    }



    public List<Iniciativa> consultarPorArea(String area) throws PersistenceException {
        try {
            return this.iniciativaMapper.consultarPorArea(area);
        } catch (Exception e) {
            throw new PersistenceException("No hay iniciativas relacionadas");
        }
    }

    public List<Iniciativa> consultarPorEstado(String estado) throws PersistenceException {
        try {
            return this.iniciativaMapper.consultarPorEstado(estado);
        } catch (Exception e) {
            throw new PersistenceException("No hay iniciativas relacionadas");
        }
    }

    public void modificarIniciativaPropietario(Iniciativa iniciativa, String area, String dependencia, String descripcion) throws PersistenceException {
        try {
            this.iniciativaMapper.modificarIniciativaPropietario(iniciativa, area, dependencia, descripcion);
        } catch (Exception e) {
            throw new PersistenceException("Ingreso de datos incorrecto");
        }
    }

    public void modificarIniciativaEstado(Iniciativa iniciativa, String estado) throws PersistenceException {
        try {
            this.iniciativaMapper.modificarIniciativaEstado(iniciativa, estado);
        } catch (Exception e) {
            throw new PersistenceException("Ingreso de datos incorrecto");
        }
    }

    @Override
    public List<Iniciativa> consultarIniciativasRelacionadas(String userName,String filtro) throws PersistenceException {
        try {
            String str ="%"+filtro+"%";
            return this.iniciativaMapper.consultarIniciativasRelacionadas(userName,str);
        } catch (Exception e) {
            throw new PersistenceException("Ingreso de datos incorrecto");
        }
    }

}
