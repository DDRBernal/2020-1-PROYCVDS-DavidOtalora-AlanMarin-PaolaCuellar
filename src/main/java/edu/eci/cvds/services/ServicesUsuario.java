package edu.eci.cvds.services;

import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.Usuario;

import java.util.List;

public interface ServicesUsuario {
    Usuario consultarUsuario(String userName);

    List<Usuario> consultarUsuariosPublico(String userNameLike );

    boolean logIn(String userName, String clave);

    void insertarUsuario(Usuario usuario);


    //Posible adicion de los las iniciativas votadas(ejm:lista de videos de me gusta)
}
