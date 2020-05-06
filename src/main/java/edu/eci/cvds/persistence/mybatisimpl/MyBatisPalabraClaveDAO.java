package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.persistence.PalabraClaveDAO;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.mybatisimpl.mappers.PalabraClaveMapper;

public class MyBatisPalabraClaveDAO implements PalabraClaveDAO {

    @Inject
    private PalabraClaveMapper palabraClaveMapper;

    public void agregarPalabrasclave(String palabraClave, String nombreIniciativa, String proponente) throws PersistenceException {
        try {
             palabraClaveMapper.agregarPalabrasclave(palabraClave, nombreIniciativa, proponente);
        } catch (Exception e) {
            throw new PersistenceException("Ingreso de datos incorrecto");
        }
    }

    public void eliminarPalabrasclave(String palabraClave, String nombreIniciativa, String proponente) throws PersistenceException {
        try {
             palabraClaveMapper.eliminarPalabrasclave(palabraClave, nombreIniciativa, proponente);
        } catch (Exception e) {
            throw new PersistenceException("Palabra inexistente");
        }
    }
}
