package br.ufpb.dcx.aps.aula3;

public class Modelo {

	private String nome;
	private Marca marca;
	private int quantidadeVeiculos = 0;

	public Modelo(String nome, Marca marca) {
		this.nome = nome;
		this.marca = marca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Modelo [nome=" + nome + ", marca=" + marca + "]";
	}
	public int getQuantidadeVeiculos() {
		return quantidadeVeiculos;
	}

	public void novoVeiculo() {
		quantidadeVeiculos ++;
		
	}
	

}