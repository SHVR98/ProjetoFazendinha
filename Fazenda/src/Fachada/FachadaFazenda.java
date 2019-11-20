package Fachada;

import RegrasNegocio.*;

import Repositorios.RepositorioCultivos;
import Repositorios.RepositorioFuncionarios;
import Repositorios.RepositorioGados;
import Repositorios.RepositorioInsumos;
import ClassesBase.*;
import Exceptions.*;


public class FachadaFazenda {
	RepositorioGados gados;
	RepositorioFuncionarios funcionarios;
	RepositorioInsumos insumos;
	RepositorioCultivos cultivos;
	
	public FachadaFazenda(RepositorioGados respositorioGado, RepositorioFuncionarios repositorioFuncionarios, RepositorioInsumos repositorioInsumos, RepositorioCultivos repositorioCultivo){
		//falta o bagui aqui, n lembro como é kkkk
		this.gados = respositorioGado;
		this.funcionarios = repositorioFuncionarios;
		this.insumos = repositorioInsumos;
		this.cultivos = repositorioCultivo;
	}

	// GADO
	public void cadastrarGado(Gado gado) throws GadoJaCadastradoException, MuitosGadosException{
		if(funcionarios.quantidadeFuncionarios*10>gados.quantidadeGados) {
		gados.inserirGado(gado);
		}
		else
			throw new MuitosGadosException();
	}

	public void removerGado(String brinco) throws GadoNaoExisteException {
		gados.removerGado(brinco);
	}

	public Gado procurarGado(String brinco) throws GadoNaoExisteException {
		return gados.procurarGado(brinco);
	}

	public void atualizarGado(Gado gado) throws GadoNaoExisteException {
		gados.atualizarGado(gado);
	}

	// INSUMO
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

	// FUNCIONARIO
	public void inserirFuncionario(Funcionario funcionario) throws FuncionarioJaCadastradoException {
		funcionarios.inserirFuncionario(funcionario);
	}

	public void atualizarFuncionario(Funcionario funcionario) throws FuncionarioNaoEncontradoException {
		funcionarios.atualizarFuncionario(funcionario);
	}

	public void removerFuncionario(String nome) throws FuncionarioNaoEncontradoException {
		funcionarios.removerFuncionario(nome);
	}

	public void procurarFuncionario(String nome) throws FuncionarioNaoEncontradoException {
		funcionarios.procurarFuncionario(nome);
	}

	// CULTIVO
	public void inserirCultivo(Cultivo cultivo) throws CultivoJaCadastradoException {
		cultivos.inserirCultivo(cultivo);
	}

	public void removerCultivo(Cultivo cultivo) throws CultivoJaCadastradoException {
		cultivos.removerCultivo(cultivo);
	}

	public Cultivo procurarCultivo(String produto) throws CultivoJaCadastradoException {
		return cultivos.procurarCultivo(produto);
	}

	public String alterarCultivo(Cultivo cultivo) throws CultivoJaCadastradoException {
		return cultivos.alterarCultivo(cultivo);
	}

}
