package RegrasNegocio;

import ClassesBase.Gado;
import Exceptions.GadoJaCadastradoException;
import Exceptions.GadoNaoExisteException;
import Repositorios.RepositorioGados;

public class CadastroGado {
	private RepositorioGados gados;

	public void cadastrarGado(Gado gado) throws GadoJaCadastradoException {
		if (!gados.existeGado(gado.getBrinco())) {
			gados.inserirGado(gado);

		} else {
			throw new GadoJaCadastradoException();
		}
	}

	public void removerGado(String brinco) throws GadoNaoExisteException {
		if (gados.existeGado(brinco)) {
			gados.removerGado(brinco);
		} else {
			throw new GadoNaoExisteException();
		}
	}

	public Gado procurarGado(String brinco) throws GadoNaoExisteException {
		if (gados.existeGado(brinco)) {
			return gados.procurarGado(brinco);
		} else {
			throw new GadoNaoExisteException();
		}

	}

	public void atualizarGado(Gado gado) throws GadoNaoExisteException {
		if (gados.existeGado(gado.getBrinco())) {
			gados.atualizarGado(gado);
		} else {
			throw new GadoNaoExisteException();
		}

	}

}
