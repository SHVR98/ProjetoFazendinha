
public class RepositorioGadosArray implements RepositorioGado {
	private Gado[] gados;
	private int indice;

	public RepositorioGadosArray(int tamanho) {
		gados = new Gado[tamanho];
	}

	public void inserirGado(Gado gado) {
		for (int a = 0; a < gados.length; a++) {
			if (gados[a] == null) {
				gados[a] = gado;
				a = gados.length + 1;
			}
		}

	}

	
	public void removerGado(String brinco) {
		for (int a = 0; a < gados.length; a++) {
			if (gados[a].getBrinco().equals(brinco)) {
				gados[a] = null;
				a = gados.length + 1;
			}
		}

	}

	
	public void procurarGado(String brinco) {
		// TODO Auto-generated method stub

	}

	
	public void atualizarGado(Gado gado) {
		for (int a = 0; a < gados.length; a++) {
			if (gados[a].getBrinco().equals(gado.getBrinco())) {
				gados[a] = gado;
				a = gados.length + 1;
			}
		}

	}

	

	
	public boolean existeGado(String brinco) {
		boolean achou = false;
		for (int a = 0; a < gados.length && gados[a] != null; a++) {
			if (gados[a].getBrinco().equals(brinco)) {
				achou = true;
				a = gados.length + 1;
			}

		}
		return achou;
	}

}
