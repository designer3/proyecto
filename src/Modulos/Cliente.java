package Modulos;

public class Cliente {
	
	private int codigo;
	private String apellido;
	private String nombre;
	private int edad;
	private int turno;
	private int estado;
	
	public Cliente(int codigo, String apellido, String nombre, int edad,
			int turno, int estado) {
	
		this.codigo = codigo;
		this.apellido = apellido;
		this.nombre = nombre;
		this.edad = edad;
		this.turno = turno;
		this.estado = estado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	

}
