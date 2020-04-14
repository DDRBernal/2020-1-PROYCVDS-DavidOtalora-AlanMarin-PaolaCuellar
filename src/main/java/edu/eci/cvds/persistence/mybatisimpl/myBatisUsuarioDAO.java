package edu.eci.cvds.persistence.mybatisimpl;

import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.mybatisimpl.mappers.UsuarioMapper;
import com.google.inject.Inject;

public class myBatisUsuarioDAO implements UsuarioDAO {
    @Inject
    private UsuarioMapper usuarioMapper;

    @Override
    public void insertarUsuario(Usuario usr) throws PersistenceException {
        try {
            usuarioMapper.insertarUsuario(usr);
        }catch (Exception e){
            throw new PersistenceException("No se logro insertar usuario");
        }
    }
}
