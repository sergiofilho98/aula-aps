package br.ufpb.dcx.aps.aula3;

public class VeiculoService extends GenericService<Veiculo> {

	@Override
	public int cadastrar(Veiculo veiculo) {
		veiculo.getModelo().novoVeiculo();
		return super.cadastrar(veiculo);
}
}
