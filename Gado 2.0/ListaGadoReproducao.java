
public class ListaGadoReproducao implements RepositorioGadoReproducao {
	private GadoReproducao gado;
	private ListaGAdoReproducao proximo;

	public ListaGadoReproducao() {
		this.gado = null;
		this.proximo = null;
	}

	public void inserirGadoReproducao(GadoReproducao gado) {
		if (this.proximo == null) {
			this.gado = gado;
			this.proximo = new Lista();
		} else {
			this.proximo.inserir(gado);
		}
	}

	public void removerGadoReproducao(GadoReproducao gado) {
		if (this.gado != null && this.gado.brinco.equals(gado.brinco)) {
			this.gado = this.proximo.gado;

			this.proximo = this.proximo.proximo;

		} else if (this.gado != null) {
			this.proximo.removerGadoReproducao(gado);
		}
	}

public void procurarGadoReproducao() {
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
