package Ventas;

public class Vendedor {

	int id_departamento;
	int codigo_vendedor;
	String nombre;
	String apellido;
	int numeroTlf;

	public Vendedor(int id_departamento, int codigo_vendedor, String nombre, String apellido, int numeroTlf) {

		this.id_departamento = id_departamento;
		this.codigo_vendedor = codigo_vendedor;
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

	public int getCodigo_vendedor() {
		return codigo_vendedor;
	}

	public void setCodigo_vendedor(int codigo_vendedor) {
		this.codigo_vendedor = codigo_vendedor;
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

		return "El id del departamento es: " + id_departamento + " el nombre del vendedor es: " + nombre + " de apellido: " + apellido + " con codigo: " + codigo_vendedor
				+ " y su numero de telefono es: " + numeroTlf;

	}

}
