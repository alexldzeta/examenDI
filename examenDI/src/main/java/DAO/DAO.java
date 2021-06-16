package DAO;

import java.util.List;

public interface DAO<T> {
	
	List<T> listarTodos();
	
	T get(int codigo);
	
	void guardar(T t);
	void borrar(int cogido);

}
