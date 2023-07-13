package clases;

public abstract class Usuario {
    protected String nombre;
    protected String contraseña;
    protected boolean bloqueado;
    protected boolean eliminado;

    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.bloqueado = false;
        this.eliminado = false;
    }
    
    
    
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (bloqueado ? 1231 : 1237);
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (bloqueado != other.bloqueado)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}




	public String getNombre() {
        return nombre;
    }

    public boolean estaBloqueado() {
        return bloqueado;
    }

    public boolean estaEliminado() {
        return true;
    }

    public void bloquear() {
        bloqueado = true;
        
    }

    public void eliminar() {
        eliminado = true;
        
    }
    
    public abstract boolean esAdministrador();
  }
		





