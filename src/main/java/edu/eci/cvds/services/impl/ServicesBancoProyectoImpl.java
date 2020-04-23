package edu.eci.cvds.services.impl;

import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.entities.Usuario;

import edu.eci.cvds.persistence.IniciativaDAO;

import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.services.ServicesBancoProyecto;
import edu.eci.cvds.services.ServicesBancoProyectoException;

import java.util.ArrayList;

import java.util.Date;

import java.util.List;

import com.google.inject.Inject;

public class ServicesBancoProyectoImpl implements ServicesBancoProyecto {
    @Inject
    private UsuarioDAO usuarioDAO;
    private IniciativaDAO iniciativaDAO;


    public void insertarIniciativa(String nombre, String descripcion, int votos, Date fecha, String nombre_proponente, String areas, String dependencia, String palabras_clave) throws ServicesBancoProyectoException {
        try {
            iniciativaDAO.insertarIniciativa(nombre,descripcion,votos,fecha,nombre_proponente,areas,dependencia,palabras_clave);
        }catch (PersistenceException e){
            throw new ServicesBancoProyectoException("Error al insertar iniciativa");
        }
    }


    public void modificarIniciativa(String nombre, String descripcion) throws ServicesBancoProyectoException {
        try{
            iniciativaDAO.modificarIniciativa(nombre,descripcion);
        }catch (PersistenceException e){
            throw new ServicesBancoProyectoException("Error al modificar iniciativa");
        }
    }


    public List<Iniciativa> getIniciativas() throws ServicesBancoProyectoException {
        try{
            return iniciativaDAO.getIniciativas();
        }catch (PersistenceException e){
            throw new ServicesBancoProyectoException("Error al consultar iniciativas");
        }
    }


    public Iniciativa getInfoIniciativa(String nombre) throws ServicesBancoProyectoException {
        try{
            return iniciativaDAO.getInfoIniciativa(nombre);
        }catch (PersistenceException e){
            throw new ServicesBancoProyectoException("Error al consultar informacion de la iniciativa");
        }
    }

    @Override
    public void insertarUsuario(Usuario usr) throws ServicesBancoProyectoException{
        try {
            usuarioDAO.insertarUsuario(usr);
        }catch (PersistenceException e){
            throw new ServicesBancoProyectoException("Error al insertar el usuario");
        }
    }

    @Override
    public List<Usuario> getUsuarios()throws ServicesBancoProyectoException
    {
        //return null;
        try{
            return usuarioDAO.getUsuarios();
        }catch (PersistenceException e){
            throw new ServicesBancoProyectoException("Error al consultar usuarios");
         }
    }

    @Override
    public Usuario consultarUsuario(String nombre)throws ServicesBancoProyectoException {
        //return null;
        try{
         return usuarioDAO.consultarUsuario(nombre);
         }catch (PersistenceException e){
         throw new ServicesBancoProyectoException("Error al consultar usuario");
         }
    }

    @Override
    public void setUsuario(String nombre, int documento, String contrasena, String tipoUsuario, String email) throws ServicesBancoProyectoException{

    }

}
