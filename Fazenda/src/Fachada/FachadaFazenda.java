package Fachada;

import RegrasNegocio.*;
import ClassesBases.*;
import Exceptions.CultivoCadastradoException;
import Exceptions.ExceptionGadoJaCadastrado;
import Exceptions.ExceptionGadoNaoExiste;
import Exceptions.FuncionarioJaCadastradoException;
import Exceptions.FuncionarioNaoEncontradoException;
import Exceptions.InsumoJaCadastradoException;
import Exceptions.InsumoNaoCadastradoException;

public class FachadaFazenda {
	RegrasNegocioGado gados;
	CadastroInsumo insumos;
	RegrasNegocioFuncionario funcionarios;
	FachadaNegocioCultivo cultivos;

	// Gado
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

	// Insumo
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

	// Funcionario
	public void inserir(Funcionario funcionario) throws FuncionarioJaCadastradoException {
		funcionarios.inserir(funcionario);
	}

	public void atualizar(Funcionario funcionario) throws FuncionarioNaoEncontradoException {
		funcionarios.atualizar(funcionario);
	}

	public void remover(Funcionario funcionario) throws FuncionarioNaoEncontradoException {
		funcionarios.remover(funcionario);
	}

	public void procurar(String nome) throws FuncionarioNaoEncontradoException {
		funcionarios.procurar(nome);
	}

	// Cultivo
	public void Inserir(Cultivo cultivo) throws CultivoCadastradoException {
		cultivos.Inserir(cultivo);
	}

	public void Remover(Cultivo cultivo) throws CultivoCadastradoException {
		cultivos.Remover(cultivo);
	}

	public Cultivo Procurar(String produto) throws CultivoCadastradoException {
		return cultivos.Procurar(produto);
	}

	public String Alterar(Cultivo cultivo) throws CultivoCadastradoException {
		return cultivos.Alterar(cultivo);
	}

}
