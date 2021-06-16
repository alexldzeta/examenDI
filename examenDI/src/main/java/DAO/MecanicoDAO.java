package DAO;

import java.util.List;

import Mecánica.Mecanicos;

public class MecanicoDAO implements DAO<Mecanicos>{
	
	List<Mecanicos> mecanicos;
	
	public MecanicoDAO() {
		
		Mecanicos mecanico1 = new Mecanicos(2, 1, "Antonio", "López", 555889966);
		Mecanicos mecanico2 = new Mecanicos(2, 2, "Jesús", "Cano", 666774411);
		Mecanicos mecanico3 = new Mecanicos(2, 3, "Jorge", "Gutiérrez", 999775566);
		mecanicos.add(mecanico1);
		mecanicos.add(mecanico2);
		mecanicos.add(mecanico3);
		
		
	}

	public List<Mecanicos> listarTodos() {
		// TODO Auto-generated method stub
		return mecanicos;
	}

	public Mecanicos get(int codigo) {
		
		return mecanicos.get(codigo);
		
	}

	public void guardar(Mecanicos t) {
		// TODO Auto-generated method stub
		
	}

	public void borrar(int cogido) {
		// TODO Auto-generated method stub
		
	}




}
