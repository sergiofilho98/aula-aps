package br.ufpb.dcx.aps.aula3.dao;

import java.util.List;

import br.ufpb.dcx.aps.aula3.Veiculo;

public class VeiculoDAOBD implements VeiculoDAO{

	@Override
	public void inserir(Veiculo t) {
		System.out.println("Inserindo veículo " + t + "no BD");
		
	}

	@Override
	public void editar(Veiculo t) {
		System.out.println("Atualizando o veículo" + t + "no BD");
		
	}

	@Override
	public void remover(Veiculo t) {
		System.out.println("Removendo o veículo" + t + "no BD");
		
	}

	@Override
	public List<Veiculo> listar() {
		System.out.println("Atualizando veículos no BD");
		return null;
	}

	@Override
	public Veiculo obter(int id) {
		System.out.println("Obtendo o veículo" + id + "no BD");
		return null;
	}
}
