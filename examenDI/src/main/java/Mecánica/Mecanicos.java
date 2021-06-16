package Mecánica;

public class Mecanicos {

	int id_departamento;
	int codigo_mecanico;
	String nombre;
	String apellido;
	int numeroTlf;

	public Mecanicos(int id_departamento, int codigo_mecanico, String nombre, String apellido, int numeroTlf) {

		this.id_departamento = id_departamento;
		this.codigo_mecanico = codigo_mecanico;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroTlf = numeroTlf;
	}

	public int getId_departamento() {
		return id_departamento;
	}

	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}

	public int getCodigo_mecanico() {
		return codigo_mecanico;
	}

	public void setCodigo_mecanico(int codigo_mecanico) {
		this.codigo_mecanico = codigo_mecanico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumeroTlf() {
		return numeroTlf;
	}

	public void setNumeroTlf(int numeroTlf) {
		this.numeroTlf = numeroTlf;
	}

	public String toString() {

		return "El id del departamento es: " + id_departamento + " el nombre del mecánico es: " + nombre + " de apellido: " + apellido + " con codigo: " + codigo_mecanico
				+ " y su numero de telefono es: " + numeroTlf;

	}

}
