package clases;

public class UsuarioAdministrador extends Usuario {
    public UsuarioAdministrador(String nombre, String contraseña) {
        super(nombre, contraseña);
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
