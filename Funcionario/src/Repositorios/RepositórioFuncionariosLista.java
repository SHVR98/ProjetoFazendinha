package Repositorios;

import ClassesBases.Funcionario;

class RepositorioFuncionariosLista implements RepositorioFuncionarios {
	private Funcionario funcionario = new Funcionario();
	private RepositorioFuncionariosLista proximo;
	
	public RepositorioFuncionariosLista() {
		this.funcionario = null;
		this.proximo = null;
	}
	
	@Override
	public void inserir(Funcionario funcionario) {

		if (this.proximo == null) {
			this.funcionario = funcionario;
			this.proximo = new RepositorioFuncionariosLista();
		} 
		else {
			this.proximo.inserir(funcionario);
		}

	}

	@Override
	public void atualizar(Funcionario funcionario) {
		
		if(this.funcionario.getNome().equals(funcionario.getNome())) {
			this.funcionario = funcionario;
		}
		else {
			this.proximo.atualizar(funcionario);
		}
		
	}
	
	@Override
	public void remover(String nome) {

		if(existe(nome)) {
			if (this.funcionario.getNome().equals(nome)) {
				this.funcionario = this.proximo.funcionario;
				this.proximo = this.proximo.proximo;
			} 
			else {
				this.proximo.remover(nome);
			}
		}

	}
	
	
	@Override
	public boolean existe(String nome) {

		if (this.proximo != null && this.funcionario.getNome().equals(nome)) {
			return true;
		} 
		else if (this.proximo != null) {
			return this.proximo.existe(nome);
		} 
		else {
			return false;
		}

	}


	@Override
	public Funcionario procurar(String nome) {
		Funcionario resposta = null;
		
		if(existe(nome)) {
			if(this.funcionario != null && this.funcionario.getNome().equals(nome)) {
				resposta = funcionario;
			}
			else {
				resposta = this.proximo.procurar(nome);
			}
		}
		
		return resposta;
	}	
	
}
