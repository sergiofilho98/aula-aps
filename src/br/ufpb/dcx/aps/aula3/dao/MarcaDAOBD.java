package br.ufpb.dcx.aps.aula3.dao;

import java.util.List;

import br.ufpb.dcx.aps.aula3.Marca;

public class MarcaDAOBD implements MarcaDAO{

	@Override
	public void inserir(Marca t) {
		System.out.println("Inserindo marca " + t + "no BD");
		
	}

	@Override
	public void editar(Marca t) {
		System.out.println("Atualizando " + t + "no BD");
		
	}

	@Override
	public void remover(Marca t) {
		System.out.println("Removendo " + t + "no BD");
		
	}

	@Override
	public List<Marca> listar() {
		System.out.println("Atualizando marcas no BD");
		return null;
	}

	@Override
	public Marca obter(int id) {
		System.out.println("Obtendo a marca" + id + "no BD");
		return null;
	}

}
