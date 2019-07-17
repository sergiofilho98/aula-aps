package br.ufpb.dcx.aps.aula3.dao;

import br.ufpb.dcx.aps.aula3.Marca;
import br.ufpb.dcx.aps.aula3.Modelo;
import br.ufpb.dcx.aps.aula3.Veiculo;

public class LogicaApp {
	
	public void rodar() {
		
		MarcaDAO marcaDAO = new MarcaDAOBD();
		Marca marca = new Marca(null);
		
		marcaDAO.inserir(marca);
		marcaDAO.editar(marca);
		marcaDAO.remover(marca);
		marcaDAO.listar();
		marcaDAO.obter(0);
		
		ModeloDAO modeloDAO = new ModeloDAOBD();
		Modelo modelo = new Modelo(null,marca);
		
		modeloDAO.inserir(modelo);
		modeloDAO.editar(modelo);
		modeloDAO.remover(modelo);
		modeloDAO.listar();
		modeloDAO.obter(0);
		
		VeiculoDAO veiculoDAO = new VeiculoDAOBD();
		Veiculo veiculo = new Veiculo(null, 0, modelo);
		
		veiculoDAO.inserir(veiculo);
		veiculoDAO.editar(veiculo);
		veiculoDAO.remover(veiculo);
		veiculoDAO.listar();
		veiculoDAO.obter(0);
	}
}
