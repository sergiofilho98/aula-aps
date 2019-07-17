package br.ufpb.dcx.aps.aula3.dao;

import java.util.List;

import br.ufpb.dcx.aps.aula3.Marca;

public class MarcaDAOREST implements MarcaDAO{

	@Override
	public void inserir(Marca t) {
		System.out.println("Inserindo marca " + t + "no REST");
		
	}

	@Override
	public void editar(Marca t) {
		System.out.println("Atualizando " + t + "no REST");
		
	}

	@Override
	public void remover(Marca t) {
		System.out.println("Removendo " + t + "no REST");
		
	}

	@Override
	public List<Marca> listar() {
		System.out.println("Atualizando marcas no REST");
		return null;
	}

	@Override
	public Marca obter(int id) {
		System.out.println("Obtendo a marca" + id + "no REST");
		return null;
	}
}
