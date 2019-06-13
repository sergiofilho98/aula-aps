package br.ufpb.dcx.aps.aula3;

public class App {
	
	private static GenericService<Marca> marcaService = new GenericService<Marca>();
	private static ModeloService modeloService = new ModeloService();
	private static GenericService<Veiculo> veiculoService = new GenericService<Veiculo>();
	

	public static void main(String[] args) {
		Marca vw = new Marca("Volkswagen");
		int vwId = marcaService.cadastrar(vw);
		Marca vwRetornada = marcaService.get(vwId);
		
		assert "Marca [nome=Volkswagen]".equals(vwRetornada.toString());

		Modelo gol = new Modelo("Gol", vw);
		int golId = modeloService.cadastrar(gol);
		Modelo golRetornado = modeloService.get(golId);
		
		assert "Modelo [nome=Gol, marca=Marca [nome=Volkswagen]]"
			.equals(golRetornado.toString());
		
		assert 1 == vw.getQuantidadeModelos();
		
		Veiculo polo = new Veiculo("Polo",vw);
		int poloID = veiculoService.cadastrar(polo);
		Veiculo poloRetornado = veiculoService.get(poloID);
		
		assert "Veiculo [nome=Polo, marca=Marca [nome=Volkswagen]]".equals(poloRetornado.toString());
	}
	
}