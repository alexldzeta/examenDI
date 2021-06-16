package DAO;

import java.util.List;

import Ventas.Vendedor;

public class VendedorDAO implements DAO<Vendedor> {

	List<Vendedor> vendedores;
	
	public VendedorDAO() {
		
		Vendedor vendedor1 = new Vendedor(3, 1, "Alfonso", "Marín", 555773366);
		Vendedor vendedor2 = new Vendedor(3, 2, "Alfredo", "Gracia", 222333111);
		Vendedor vendedor3 = new Vendedor(3, 3, "Alvaro", "Gonzalez", 888559977);
		vendedores.add(vendedor1);
		vendedores.add(vendedor2);
		vendedores.add(vendedor3);
		
	}
	
	
	public List<Vendedor> listarTodos() {
	
		return vendedores;
	}

	public Vendedor get(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	public void guardar(Vendedor t) {
		// TODO Auto-generated method stub
		
	}

	public void borrar(int cogido) {
		// TODO Auto-generated method stub
		
	}

}
