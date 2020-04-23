package edu.eci.cvds.services;


import edu.eci.cvds.persistence.PersistenceException;

public class ServicesBancoProyectoException extends Exception{

    public ServicesBancoProyectoException(){
    }

    public ServicesBancoProyectoException(String message){
        super(message);
    }

    public ServicesBancoProyectoException(String string, PersistenceException ex) {
        super(string, ex);
    }
}