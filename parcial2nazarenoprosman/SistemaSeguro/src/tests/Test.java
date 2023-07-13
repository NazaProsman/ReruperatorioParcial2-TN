package tests;

import static org.junit.Assert.*;

import org.junit.rules.ExpectedException;

import clases.UserAlreadyExistsException;
import clases.UserNotFoundException;
import clases.Usuario;
import clases.UsuarioAdministrador;
import clases.UsuarioBasico;
import clases.UsuarioManager;

public class Test {

	@org.junit.Test
	public void testCrearUsuarioBasico() {
		
		UsuarioBasico usuarioBasico1 = new UsuarioBasico("usuario1", "contraseña1");
        UsuarioBasico usuarioBasico2 = new UsuarioBasico("usuario2", "contraseña2");
        
        assertEquals("usuario1", usuarioBasico1.getNombre());
        assertEquals("usuario2", usuarioBasico2.getNombre());
	}

	@org.junit.Test
	public void testCrearUsuarioAdministrador() {
		
		UsuarioAdministrador usuarioAdministrador1 = new UsuarioAdministrador("usuario1", "contraseña1");
		UsuarioAdministrador usuarioAdministrador2 = new UsuarioAdministrador("usuario2", "contraseña1");
        
        assertEquals("usuario1", usuarioAdministrador1.getNombre());
        assertEquals("usuario2", usuarioAdministrador2.getNombre());
	}
	
	
	@org.junit.Test
	public void testCrearAgregarYBuscarPorUsuario() throws UserNotFoundException, UserAlreadyExistsException {
		
		
		UsuarioManager usuarioManager = new UsuarioManager();
		UsuarioBasico usuarioBasico1 = new UsuarioBasico("usuario1", "contraseña1");
        UsuarioBasico usuarioBasico2 = new UsuarioBasico("usuario2", "contraseña2");
        
        usuarioManager.agregarUsuario(usuarioBasico1);
        
       
        
        assertEquals("usuario1", usuarioManager.buscarUsuario("usuario1"));
		
		
		
		
	}
	
	
	
	@org.junit.Test(expected = UserNotFoundException.class) 
	public void testbuscarUsuarioYqueNoExistaYtireUNAEXPETION() throws UserNotFoundException, UserAlreadyExistsException {
		
		
		UsuarioManager usuarioManager = new UsuarioManager();
		UsuarioBasico usuarioBasico1 = new UsuarioBasico("usuario1", "contraseña1");
        UsuarioBasico usuarioBasico2 = new UsuarioBasico("usuario2", "contraseña2");
        
        usuarioManager.agregarUsuario(usuarioBasico1);
        
       
        
        assertEquals("usuario1", usuarioManager.buscarUsuario("usuario2"));
		
		
		
		
	}
	
	
	
	
	
	
	
	
	@org.junit.Test(expected = UserAlreadyExistsException.class) 
	public void testTireExepcionDeQueYaExiste() throws UserNotFoundException, UserAlreadyExistsException {
		
		
		UsuarioManager usuarioManager = new UsuarioManager();
		UsuarioBasico usuarioBasico1 = new UsuarioBasico("usuario1", "contraseña1");
        UsuarioBasico usuarioBasico2 = new UsuarioBasico("usuario2", "contraseña2");
        
        usuarioManager.agregarUsuario(usuarioBasico1);
        usuarioManager.agregarUsuario(usuarioBasico1);
       
        
       
		
		
		
		
	}
	
	
	@org.junit.Test 
	public void testElminarUsuario() throws UserAlreadyExistsException, UserNotFoundException  {
		
		
		UsuarioManager usuarioManager = new UsuarioManager();
		UsuarioBasico usuarioBasico1 = new UsuarioBasico("usuario1", "contraseña1");
        UsuarioBasico usuarioBasico2 = new UsuarioBasico("usuario2", "contraseña2");
        
        usuarioManager.agregarUsuario(usuarioBasico1);
        
       
           
		
		usuarioManager.eliminarUsuario("usuario1");
	
		assertTrue(usuarioBasico1.estaEliminado());
	
}

	
	
	
	
}