package br.ufpb.dcx.aps.aula3.dao;

public class LogicaAppREST extends LogicaApp{
	
	protected VeiculoDAO criarVeiculoDAO() {
		return new VeiculoDAOREST();
	}
	protected ModeloDAO criarModeloDAO() {
		return new ModeloDAOREST();
	}
	protected MarcaDAO criarMarcaDAO() {
		return new MarcaDAOREST();
	}
}
