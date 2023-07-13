package clases;

public class UsuarioAdministrador extends Usuario {
    public UsuarioAdministrador(String nombre, String contraseņa) {
        super(nombre, contraseņa);
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
