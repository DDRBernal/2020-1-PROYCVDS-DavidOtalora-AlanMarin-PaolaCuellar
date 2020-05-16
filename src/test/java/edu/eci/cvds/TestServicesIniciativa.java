package edu.eci.cvds;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.Assert;

import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.services.ServicesBancoProyectoFactory;
import edu.eci.cvds.services.ServicesIniciativa;
import edu.eci.cvds.services.ServicesUsuario;
public class TestServicesIniciativa {
    
    @Inject
    private SqlSession sqlSession;

    ServicesUsuario servicesUsuario;
    ServicesIniciativa servicesIniciativa;
    
    public TestServicesIniciativa() {
        servicesIniciativa = ServicesBancoProyectoFactory.getInstance().getServicesIniciativa();
        
    }

    /**
    @Test
    public void insertarIniciativa(){
        servicesIniciativa.crearIniciativa("Glass JDM", new SimpleDateFormat("dd/mm/yyyy").format(new Date(15/05/2020)), "revision", "proponente2", "industrial","industrial", "Es un mecanismo para todas las propiedades horizontales, que puedan limpiar los vidrios en las alturas instalando una única vez el producto");
    }
    */   
	
	

    
    @Test
    public void consultarIniciativa(){
        try{
            servicesIniciativa.consultarIniciativa("Protesis de brazos");
        }catch(Exception e){
            Assert.assertTrue(false);
        }
    }
    
    @Test
    public void consultarPorArea(){
        try{
            servicesIniciativa.consultarPorArea("industrial");
        }catch(Exception e){
            Assert.assertTrue(false);
        }
    }

    @Test
    public void consultarPorEstado(){
        try{
            servicesIniciativa.consultarPorEstado("revision");
        }catch(Exception e){
            Assert.assertTrue(false);
        }
    }
}