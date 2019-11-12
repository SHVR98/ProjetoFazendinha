
public class RepositorioGadosLista implements RepositorioGado {
	private Gado gado;
	private RepositorioGadosLista proximo;

	public RepositorioGadosLista() {
		this.gado = null;
		this.proximo = null;
	}

	public void inserirGado(Gado gado) {
		if (this.proximo == null) {
			this.gado = gado;
			this.proximo = new RepositorioGadosLista();
		} else {
			this.proximo.inserirGado(gado);
		}
	}

	public void removerGado(String brinco) throws ExceptionGado {
		if (this.gado != null && this.gado.getBrinco().equals(brinco)) {
			this.gado = this.proximo.gado;
			this.proximo = this.proximo.proximo;

		} else if (this.gado != null) {
			this.proximo.removerGado(brinco);
		}

	}

	public void procurarGado(String brinco) throws ExceptionGado {

	}

	public void atualizarGado(Gado gado) throws ExceptionGado {
		if (this.gado != null && this.gado.getBrinco().equals(gado.getBrinco())) {
			this.gado = gado;
			

		} else if (this.gado != null) {
			this.proximo.atualizarGado(gado);
		}


	}

	public boolean existeGado(String brinco) throws ExceptionGado {
		boolean achou = false;
		if (this.gado != null && this.gado.getBrinco().equals(brinco))
			achou = true;
		else if (this.gado != null)
			return this.proximo.existeGado(brinco);

		return achou;

	}

}
