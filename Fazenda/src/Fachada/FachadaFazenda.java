package Fachada;

import RegrasNegocio.*;
import ClassesBases.*;
import Exceptions.ExceptionGadoJaCadastrado;
import Exceptions.ExceptionGadoNaoExiste;
import Exceptions.InsumoJaCadastradoException;
import Exceptions.InsumoNaoCadastradoException;

public class FachadaFazenda {
	RegrasNegocioGado gados;
	CadastroInsumo insumos;
	// regra de negocio da classe gado
	public void cadastrarGado(Gado gado) throws ExceptionGadoJaCadastrado {
		gados.cadastrarGado(gado);
	}

	public void removerGado(String brinco) throws ExceptionGadoNaoExiste {
		gados.removerGado(brinco);
	}

	public Gado procurarGado(String brinco) throws ExceptionGadoNaoExiste {
		return gados.procurarGado(brinco);

	}

	public void atualizarGado(Gado gado) throws ExceptionGadoNaoExiste {
		gados.atualizarGado(gado);

	}
	// Regra de negocio da classe insumo
	public void inserirInsumo(Insumo insumo) throws InsumoJaCadastradoException {
		insumos.inserirInsumo(insumo);
	}

	public void removerInsumo(Insumo insumo) throws InsumoNaoCadastradoException {

		insumos.removerInsumo(insumo);

	}
	
	public Insumo procurarInsumo(String item) throws InsumoNaoCadastradoException {
		return insumos.procurarInsumo(item);
	}
	public void alterarInsumo(Insumo insumo) throws InsumoNaoCadastradoException {
		insumos.alterarInsumo(insumo);
	}

}
