package clases;

public class UsuarioBasico extends Usuario {
    private int intentosFallidos;

    public UsuarioBasico(String nombre, String contraseņa) {
        super(nombre, contraseņa);
        this.intentosFallidos = 0;
    }

   

    public boolean esBloqueable() {
        return true;
    }

    public boolean esEliminable() {
        return true;
    }

    public boolean esAdministrador() {
        return false;
    }
}
