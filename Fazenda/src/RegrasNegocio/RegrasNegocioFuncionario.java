package RegrasNegocio;

import ClassesBases.Funcionario;
import Exceptions.FuncionarioJaCadastradoException;
import Exceptions.FuncionarioNaoEncontradoException;
import Repositorios.RepositorioFuncionarios;

public class RegrasNegocioFuncionario {
	private RepositorioFuncionarios funcionarios;
	
	public void inserir(Funcionario funcionario) throws FuncionarioJaCadastradoException {
		if(funcionarios.existe(funcionario.getNome())) {
			throw new FuncionarioJaCadastradoException();
		}
		else {
			funcionarios.inserir(funcionario);
		}
	}
	
	public void atualizar(Funcionario funcionario) throws FuncionarioNaoEncontradoException {
		if(funcionarios.existe(funcionario.getNome())) {
			funcionarios.atualizar(funcionario);
		}
		else {
			throw new FuncionarioNaoEncontradoException();
		}
	}
	
	public void remover(Funcionario funcionario) throws FuncionarioNaoEncontradoException {
		if(funcionarios.existe(funcionario.getNome())) {
			funcionarios.remover(funcionario.getNome());
		} 
		else {
			throw new FuncionarioNaoEncontradoException();
		}
	}
	
	public void procurar(String nome) throws FuncionarioNaoEncontradoException {
		if(funcionarios.existe(nome)) {
			funcionarios.procurar(nome);
		}
		else {
			throw new FuncionarioNaoEncontradoException();
		}
		
	}
	
	
}
