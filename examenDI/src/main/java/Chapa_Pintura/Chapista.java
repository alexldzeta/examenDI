package Chapa_Pintura;

public class Chapista {

	int id_departamento;
	int codigo_chapista;
	String nombre;
	String apellido;
	int numeroTlf;

	public Chapista(int id_departamento, int codigo_chapista, String nombre, String apellido, int numeroTlf) {

		this.id_departamento = id_departamento;
		this.codigo_chapista = codigo_chapista;
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

	public int getCodigo_chapista() {
		return codigo_chapista;
	}

	public void setCodigo_chapista(int codigo_chapista) {
		this.codigo_chapista = codigo_chapista;
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

		return "El id del departamento es: " + id_departamento + " el nombre del chapista es: " + nombre + " de apellido: " + apellido + " con codigo: " + codigo_chapista
				+ " y su numero de telefono es: " + numeroTlf;

	}

}
