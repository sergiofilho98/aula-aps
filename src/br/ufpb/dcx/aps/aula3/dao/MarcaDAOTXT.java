package br.ufpb.dcx.aps.aula3.dao;

import java.util.List;

import br.ufpb.dcx.aps.aula3.Marca;

public class MarcaDAOTXT implements MarcaDAO{

		@Override
		public void inserir(Marca t) {
			System.out.println("Inserindo marca " + t + "no TXT");
			
		}

		@Override
		public void editar(Marca t) {
			System.out.println("Atualizando " + t + "no TXT");
			
		}

		@Override
		public void remover(Marca t) {
			System.out.println("Removendo " + t + "no TXT");
			
		}

		@Override
		public List<Marca> listar() {
			System.out.println("Atualizando marcas no TXT");
			return null;
		}

		@Override
		public Marca obter(int id) {
			System.out.println("Obtendo a marca" + id + "no TXT");
			return null;
		}
}
