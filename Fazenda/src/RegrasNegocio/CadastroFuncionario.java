package RegrasNegocio;

import ClassesBase.Funcionario;
import Exceptions.FuncionarioJaCadastradoException;
import Exceptions.FuncionarioNaoEncontradoException;
import Exceptions.SalarioInvalidoException;
import Repositorios.RepositorioFuncionarios;

public class CadastroFuncionario {
	private RepositorioFuncionarios funcionarios;
	
	public int quantidadeFuncionarios = 0;

	public  CadastroFuncionario(RepositorioFuncionarios repositorioFuncionarios) {
		this.funcionarios = repositorioFuncionarios;
	}

	public void inserirFuncionario(Funcionario funcionario) throws FuncionarioJaCadastradoException, SalarioInvalidoException {
		if (funcionarios.existeFuncionario(funcionario.getNome())) {
			throw new FuncionarioJaCadastradoException();
		} else {
			if(funcionario.getSalario() <= 0) {
				throw new SalarioInvalidoException();
			}
			else {
				funcionarios.inserirFuncionario(funcionario);
				quantidadeFuncionarios++;
			}
		}
	}

	public void atualizarFuncionario(Funcionario funcionario) throws FuncionarioNaoEncontradoException {
		if (funcionarios.existeFuncionario(funcionario.getNome())) {
			funcionarios.atualizarFuncionario(funcionario);
		} else {
			throw new FuncionarioNaoEncontradoException();
		}
	}

	public void removerFuncionario(String nome) throws FuncionarioNaoEncontradoException {
		if (funcionarios.existeFuncionario(nome)) {
			funcionarios.removerFuncionario(nome);
			quantidadeFuncionarios--;
		} else {
			throw new FuncionarioNaoEncontradoException();
		}
	}

	public void procurarFuncionario(String nome) throws FuncionarioNaoEncontradoException {
		if (funcionarios.existeFuncionario(nome)) {
			funcionarios.procurarFuncionario(nome);
		} else {
			throw new FuncionarioNaoEncontradoException();
		}

	}

}
