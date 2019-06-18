package br.ufpb.dcx.aps.aula3;

public class Veiculo {

	private String nome;
	private Marca marca;
	private String cor;
	private int quantPortas;
	private String chassi;

	public Veiculo(String nome, Marca marca, String cor, int quantPortas,String chassi) {
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.quantPortas = quantPortas;
		this.setChassi(chassi);
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
		return "Veiculo [Nome=" + nome + ", Marca=" + marca + ", Cor=" + cor + ", Quantidade "
				+ "de Portas=" + quantPortas + ", Chassi=" + chassi +"]";
	}

	public int getQuantPortas() {
		return quantPortas;
	}

	public void setQuantPortas(int quantPortas) {
		this.quantPortas = quantPortas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

}
