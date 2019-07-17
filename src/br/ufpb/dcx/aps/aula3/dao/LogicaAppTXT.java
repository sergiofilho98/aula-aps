package br.ufpb.dcx.aps.aula3.dao;

public class LogicaAppTXT extends LogicaApp {

		protected VeiculoDAO criarVeiculoDAO() {
			return new VeiculoDAOTXT();
		}
		protected ModeloDAO criarModeloDAO() {
			return new ModeloDAOTXT();
		}
		protected MarcaDAO criarMarcaDAO() {
			return new MarcaDAOTXT();
		}
}