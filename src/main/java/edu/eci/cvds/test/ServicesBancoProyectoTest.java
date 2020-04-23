package edu.eci.cvds.test;

import com.google.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.services.ServicesBancoProyecto;
import edu.eci.cvds.services.ServicesBancoProyectoException;
import edu.eci.cvds.services.ServicesBancoProyectoFactory;

import org.junit.Assert;

public class ServicesBancoProyectoTest {

    @Inject
    private SqlSession sqlSession;

    ServicesBancoProyecto servicesBancoProyecto;
    private String nombre=null;

    public ServicesBancoProyectoTest() {
        servicesBancoProyecto = ServicesBancoProyectoFactory.getInstance().getServicesBancoProyecto();
    }

    @Before
    public void setUp() {
    }

    @Test
    public void emptyDB() {
        for(int i = 0; i < 100; i += 10) {
            boolean r = false;
            try {
                Usuario usuario = servicesBancoProyecto.consultarUsuario(nombre);
            } catch(ServicesBancoProyectoException e) {
                r = true;
            }
            // Valida que el usuario no fue encontrado;
            Assert.assertTrue(r);
        }
    }
}


