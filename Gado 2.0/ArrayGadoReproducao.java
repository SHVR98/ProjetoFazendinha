public class ArrayGadoReproducao implements RepositorioGadoReproducao {

	public void inserirGadoReproducao(GadoReproducao gado) {
		for (int a = 0; a < arrayGAdoReproducao.lenght; a++) {
			if (arrayGadoReproducao[a] == null) {
				arrayGadoReproducao[a] = gado;
				a = arrayGadoReproducao.lenght + 1;
			}
		}

	}

	public void removerGadoReproducao(GadoReproducao gado) {
		for (int a = 0; a < arrayGAdoReproducao.lenght; a++) {
			if (arrayGadoReproducao[a] == gado) {
				arrayGadoReproducao[a] = null;
				a = arrayGadoReproducao.lenght + 1;
			}
		}

	}

	public void procurarGadoReproducao(GadoReproducao gado) {
		boolean achou = false;
		for (int a = 0; a < arrayGAdoReproducao.lenght; a++) {
			if (arrayGadoReproducao[a] == gado) {
				achou = true;
				a = arrayGadoReproducao.lenght + 1;
			}

		}
		if(achou)
			System.out.printf("Aoba o gado %s esta cadastrado",gado);
		else
			//chamar exceçao
	}

}


