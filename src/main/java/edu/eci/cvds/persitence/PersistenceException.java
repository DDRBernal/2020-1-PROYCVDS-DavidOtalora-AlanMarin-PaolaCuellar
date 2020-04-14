package edu.eci.cvds.persitence;



public class PersistenceException extends Exception {

    public PersistenceException(String message){
        super(message);
    }

    public PersistenceException(String message, Throwable t) {
        super(message);
    }
}