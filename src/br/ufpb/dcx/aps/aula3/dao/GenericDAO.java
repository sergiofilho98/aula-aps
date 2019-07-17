package br.ufpb.dcx.aps.aula3.dao;

import java.util.List;

public interface GenericDAO<T> {
	
	void inserir (T t);
	void editar (T t);
	void remover (T t);
	List<T> listar();
	T obter(int id);

}
