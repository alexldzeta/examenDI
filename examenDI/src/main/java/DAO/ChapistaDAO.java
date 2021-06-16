package DAO;

import java.util.List;

import Chapa_Pintura.Chapista;

public class ChapistaDAO implements DAO<Chapista> {
	
	List<Chapista> chapistas;
	
	public ChapistaDAO() {
		
		Chapista chapista1 = new Chapista(1, 1, "Fernando", "Casas", 635187822);
		Chapista chapista2 = new Chapista(1, 2 , "Manuel", "García", 445628955);
		Chapista chapista3 = new Chapista(1, 3 , "Alejandro", "Martinez", 654482211);
		chapistas.add(chapista1);
		chapistas.add(chapista2);
		chapistas.add(chapista3);
		
	}

	public List<Chapista> listarTodos() {
		
		return chapistas;
	}

	public Chapista get(int codigo) {
		
		return chapistas.get(codigo);
	}

	public void guardar(Chapista t) {
		
		
	}

	public void borrar(int cogido) {
		
		
	}

}
