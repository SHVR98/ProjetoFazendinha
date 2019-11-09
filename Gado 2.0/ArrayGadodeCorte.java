
public class ArrayGadodeCorte implements RepositorioGadoCorte {

	public void inserirGadoCorte(GadoCorte gado) {
		for (int a = 0; a < arrayGAdoCorte.lenght; a++) {
			if (arrayGadoCorte[a] == null) {
				arrayGadoCorte[a] = gado;
				a = arrayGadoCorte.lenght + 1;
			}
		}

	}

	public void removerGadoCorte(GadoCorte gado) {
		for (int a = 0; a < arrayGAdoCorte.lenght; a++) {
			if (arrayGadoCorte[a] == gado) {
				arrayGadoCorte[a] = null;
				a = arrayGadoCorte.lenght + 1;
			}
		}

	}

	public void procurarGadoCorte(GadoCorte gado) {
		boolean achou = false;
		for (int a = 0; a < arrayGAdoCorte.lenght; a++) {
			if (arrayGadoCorte[a] == gado) {
				achou = true;
				a = arrayGadoCorte.lenght + 1;
			}

		}
		if(achou)
			System.out.printf("Aoba o gado %s esta cadastrado",gado);
		else
			//chamar exceçao
	}

}
