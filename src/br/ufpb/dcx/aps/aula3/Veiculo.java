package br.ufpb.dcx.aps.aula3;

public class Veiculo {

	private String cor;
	private Modelo modelo;
	private int ano;

	public Veiculo(String cor, int ano, Modelo modelo) {
		this.cor = cor;
		this.ano = ano;
		this.modelo = modelo;
		
		this.modelo.addVeiculos(this);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Veiculo [cor=" + cor + ", ano=" + ano + ", modelo=" + modelo + "]";
	}
}