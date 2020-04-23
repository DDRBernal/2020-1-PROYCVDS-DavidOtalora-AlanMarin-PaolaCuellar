package edu.eci.cvds;

import java.util.List;

import com.google.inject.Inject;
import org.junit.Assert;
import org.junit.Test;

import edu.eci.cvds.entities.Usuario;

import edu.eci.cvds.services.ServicesBancoProyecto;
import edu.eci.cvds.services.ServicesBancoProyectoException;
import edu.eci.cvds.services.ServicesBancoProyectoFactory;

public class ServicesBancoProyectoTest {

    ServicesBancoProyecto servicesBancoProyecto;


    public ServicesBancoProyectoTest() {
        servicesBancoProyecto = ServicesBancoProyectoFactory.getInstance().getServicesBancoProyectoTesting();
    }    
    /**
    @Test
    public void consultarUsuarios() {
        try {
            List<Usuario> usuarios = servicesBancoProyecto.getUsuarios();
        } catch (ServicesBancoProyectoException ex) {
            Assert.assertTrue(false);
        }
    }*/
}


