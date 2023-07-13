package clases;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class UsuarioManager {
    private ArrayList<Usuario> usuarios;

    public UsuarioManager() {
        usuarios = new ArrayList<>();
    }
   
    
    public void agregarUsuario(Usuario usuario) throws UserAlreadyExistsException {
        if (existeUsuario(usuario.getNombre())) {
            throw new UserAlreadyExistsException("Ya existe un usuario con el nombre " + usuario.getNombre());
        }
        usuarios.add(usuario);
     //   Collections.sort(usuarios); // deberia ordernalos pero :/
    }
    
    public boolean existeUsuario(String nombreUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombreUsuario)) {
                return true;
            }
        }
        return false;
    }
    
    
    public String buscarUsuario(String nombreUsuario) throws UserNotFoundException {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombreUsuario)) {
                return usuario.getNombre();
            }
        }
        throw new UserNotFoundException("El usuario " + nombreUsuario + " no existe en la base de datos.");
    }
    
    public void eliminarUsuario(String nombreUsuario) throws UserNotFoundException {
    	for (Usuario usuario : usuarios) 
        if (usuario != null) {
            usuario.eliminar();
            if (usuario.esAdministrador()) {
				
			}
            
        } else {
            throw new UserNotFoundException("El usuario " + nombreUsuario + " no existe en la base de datos.");
        }
    }
    
  
    
    
}
    
    


  





