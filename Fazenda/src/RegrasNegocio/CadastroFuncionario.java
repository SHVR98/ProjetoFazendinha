package RegrasNegocio;

import ClassesBase.Funcionario;
import Exceptions.FuncionarioJaCadastradoException;
import Exceptions.FuncionarioNaoEncontradoException;
import Repositorios.RepositorioFuncionarios;

public class CadastroFuncionario {
	private RepositorioFuncionarios funcionarios;
	
	public void inserirFuncionario(Funcionario funcionario) throws FuncionarioJaCadastradoException {
		if(funcionarios.existeFuncionario(funcionario.getNome())) {
			throw new FuncionarioJaCadastradoException();
		}
		else {
			funcionarios.inserirFuncionario(funcionario);
		}
	}
	
	public void atualizarFuncionario(Funcionario funcionario) throws FuncionarioNaoEncontradoException {
		if(funcionarios.existeFuncionario(funcionario.getNome())) {
			funcionarios.atualizarFuncionario(funcionario);
		}
		else {
			throw new FuncionarioNaoEncontradoException();
		}
	}
	
	public void removerFuncionario(Funcionario funcionario) throws FuncionarioNaoEncontradoException {
		if(funcionarios.existeFuncionario(funcionario.getNome())) {
			funcionarios.removerFuncionario(funcionario.getNome());
		} 
		else {
			throw new FuncionarioNaoEncontradoException();
		}
	}
	
	public void procurarFuncionario(String nome) throws FuncionarioNaoEncontradoException {
		if(funcionarios.existeFuncionario(nome)) {
			funcionarios.procurarFuncionario(nome);
		}
		else {
			throw new FuncionarioNaoEncontradoException();
		}
		
	}
	
	
}
