package edu.eci.cvds;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.services.ServicesBancoProyectoFactory;
import edu.eci.cvds.services.ServicesUsuario;

import java.util.List;

public class MAIN {

    public static void main(String[] args) {
        ServicesUsuario servicesBancoProyecto = ServicesBancoProyectoFactory.getInstance().getServicesBancoProyecto();

        System.out.println(servicesBancoProyecto.consultarUsuariosPublico("admin").size());
    }
}
