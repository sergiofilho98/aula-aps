package br.ufpb.dcx.aps.aula3;

public class Veiculo {

	private String nome;
	private Marca marca;

	public Veiculo(String nome, Marca marca) {
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
		return "Veiculo [nome=" + nome + ", marca=" + marca + "]";
	}

}
