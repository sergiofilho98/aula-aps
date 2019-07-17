package br.ufpb.dcx.aps.aula3.dao;

import java.util.List;

import br.ufpb.dcx.aps.aula3.Modelo;

public class ModeloDAOBD implements ModeloDAO{

	@Override
	public void inserir(Modelo t) {
		System.out.println("Inserindo modelo " + t + "no BD");
		
	}

	@Override
	public void editar(Modelo t) {
		System.out.println("Atualizando o modelo" + t + "no BD");
		
	}

	@Override
	public void remover(Modelo t) {
		System.out.println("Removendo o modelo" + t + "no BD");
		
	}

	@Override
	public List<Modelo> listar() {
		System.out.println("Atualizando modelos no BD");
		return null;
	}

	@Override
	public Modelo obter(int id) {
		System.out.println("Obtendo o modelo" + id + "no BD");
		return null;
	}
}
