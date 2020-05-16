package edu.eci.cvds;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.Assert;

import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.services.ServicesBancoProyectoFactory;
import edu.eci.cvds.services.ServicesUsuario;

public class TestServicesUsuario {
    
    
    @Inject
    private SqlSession sqlSession;

    ServicesUsuario servicesUsuario;

    public TestServicesUsuario(){
        servicesUsuario = ServicesBancoProyectoFactory.getInstance().getServicesUsuario();    
    }

    @Test
    public void consultarUsuario() {
    	try {
    		servicesUsuario.consultarUsuario("admin");
    	}catch(Exception e){
    		Assert.assertTrue(false);    		
    	}  	
    }

    @Test
    public void consultarUsuarios() {
    	try {
    		servicesUsuario.consultarUsuariosPublico("pmo");
    	}catch(Exception e){
    		Assert.assertTrue(false);    		
    	}  	
    }

    @Test
    public void insertarUsuario(){
        servicesUsuario.insertarUsuario(new Usuario("JuanMe",1019223112,"Juan","Mendez","estudiante","ju4nm3","pmo","juanme@mail.escuelaing.edu.co"));
        try{
            servicesUsuario.consultarUsuario("JuanMe");
        }catch(Exception e){
            Assert.assertTrue(false);
        }
    }



}