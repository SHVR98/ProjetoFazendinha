package RegrasNegocio;

import ClassesBases.Gado;
import Exceptions.ExceptionGadoJaCadastrado;
import Exceptions.ExceptionGadoNaoExiste;
import Repositorios.RepositorioGado;

public class RegrasNegocioGado {
	private RepositorioGado gados;
public int quantidadeGados=0;
	public void cadastrarGado(Gado gado) throws ExceptionGadoJaCadastrado {
		if (!gados.existeGado(gado.getBrinco())) {
			gados.inserirGado(gado);
			quantidadeGados++;

		} else {
			throw new ExceptionGadoJaCadastrado();
		}
	}

	public void removerGado(String brinco) throws ExceptionGadoNaoExiste {
		if (gados.existeGado(brinco)) {
			gados.removerGado(brinco);
			quantidadeGados--;
		} else {
			throw new ExceptionGadoNaoExiste();
		}
	}

	public Gado procurarGado(String brinco) throws ExceptionGadoNaoExiste {
		if (gados.existeGado(brinco)) {
			return gados.procurarGado(brinco);
		} else {
			throw new ExceptionGadoNaoExiste();
		}

	}

	public void atualizarGado(Gado gado) throws ExceptionGadoNaoExiste {
		if (gados.existeGado(gado.getBrinco())) {
			gados.atualizarGado(gado);
		} else {
			throw new ExceptionGadoNaoExiste();
		}

	}

}
