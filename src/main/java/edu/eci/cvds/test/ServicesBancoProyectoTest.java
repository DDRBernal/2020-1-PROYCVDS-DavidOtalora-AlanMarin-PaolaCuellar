package edu.eci.cvds.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    public void consultarUsuario(){
        try {
            Usuario usuario = servicesBancoProyecto.consultarUsuario("Paola");
            nombre = usuario.getNombre();
            assertTrue(true);

        } catch (ServicesBancoProyectoException ex) {
            assertTrue(false);
        }
    }
}


