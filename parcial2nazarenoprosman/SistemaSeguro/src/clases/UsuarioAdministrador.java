package clases;

public class UsuarioAdministrador extends Usuario {
    public UsuarioAdministrador(String nombre, String contrase�a) {
        super(nombre, contrase�a);
    }

    public boolean esBloqueable() {
        return false;
    }

    public boolean esEliminable() {
        return false;
    }

    public boolean esAdministrador() {
        return true;
    }
}
