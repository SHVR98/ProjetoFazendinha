public class ListaGadoCorte implements RepositorioGadoCorte {
	private GadoCorte gado;
	private ListaGAdoCorte proximo;

	public ListaGadoCorte() {
		this.gado = null;
		this.proximo = null;
	}

	public void inserirGadoCorte(GadoCorte gado) {
		if (this.proximo == null) {
			this.gado = gado;
			this.proximo = new Lista();
		} else {
			this.proximo.inserir(gado);
		}
	}

	public void removerGadoCorte(GadoCorte gado) {
		if (this.gado != null && this.gado.brinco.equals(gado.brinco)) {
			this.gado = this.proximo.gado;

			this.proximo = this.proximo.proximo;

		} else if (this.gado != null) {
			this.proximo.removerGadoCorte(gado);
		}
	}

public void procurarGadoCorte() {
	boolean achou =false;
	if (this.gado != null && this.gado.brinco.equals(gado.brinco))
	achou=true;
	else if (this.gado != null)
		return this.proximo.existe(gado);
	
if(achou)
	System.out.printf("Aoba o gado %s esta cadastrado",gado);
else 
	//chamar ecxcessao
}
}
