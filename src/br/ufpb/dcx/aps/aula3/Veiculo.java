package br.ufpb.dcx.aps.aula3;

public class Veiculo {

	private Modelo modelo;
	private String cor;
	private int ano;

	public Veiculo(String cor, int ano,Modelo modelo) {
		this.setModelo(modelo);
		this.setCor(cor);
		this.setAno(ano);
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", cor=" + cor + ", ano=" + ano + "]";
	}

}
