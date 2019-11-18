package ClassesBases;

public class GadoReproducao extends Gado {
	public GadoReproducao(String brinco, char genero, String raca, boolean vacina, int anoNascimento) {
		super(brinco, genero, raca, vacina, anoNascimento);
		// TODO Auto-generated constructor stub
	}

	private int concentracaoMl;

	public int getConcentracaoMl() {
		return this.concentracaoMl;
	}

	public void setConcentracaoMl(int concentracaoMl) {
		this.concentracaoMl = concentracaoMl;
	}
}
