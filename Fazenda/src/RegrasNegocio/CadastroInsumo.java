package RegrasNegocio;

import ClassesBases.Insumo;
import Exceptions.InsumoJaCadastradoException;
import Exceptions.InsumoNaoCadastradoException;
import Repositorios.RepositorioInsumos;

public class CadastroInsumo // classse de regra de negocio
{
	private RepositorioInsumos insumos;

	public void inserirInsumo(Insumo insumo) throws InsumoJaCadastradoException {
		if (insumos.Existe(insumo.getNome())) {
			throw new InsumoJaCadastradoException();
		} else {
			insumos.Inserir(insumo);
		}
	}

	public void removerInsumo(Insumo insumo) throws InsumoNaoCadastradoException {
		if (insumos.Existe(insumo.getNome())) {
			insumos.Remover(insumo);
		} else {
			throw new InsumoNaoCadastradoException();
		}
	}

	public Insumo procurarInsumo(String item) throws InsumoNaoCadastradoException {
		if (insumos.Existe(item)) {
			return insumos.Procurar(item);
		} else {
			throw new InsumoNaoCadastradoException();
		}
	}

	public void alterarInsumo(Insumo insumo) throws InsumoNaoCadastradoException {
		if (insumos.Existe(insumo.getNome())) {
			insumos.Alterar(insumo);
		} else {
			throw new InsumoNaoCadastradoException();
		}
	}
}
