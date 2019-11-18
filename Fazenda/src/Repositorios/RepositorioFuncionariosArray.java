package Repositorios;

import ClassesBases.Funcionario;

class RepositorioFuncionariosArray implements RepositorioFuncionarios{
	private Funcionario[] funcionarios;
	private int indice;
	
	public RepositorioFuncionariosArray(int tamanho) {
		this.funcionarios = new Funcionario[tamanho];
		this.indice = 0;
	}

	@Override
	public void inserir(Funcionario funcionario) {
		funcionarios[indice] = funcionario;
		indice = indice++;
	}

	@Override
	public void atualizar(Funcionario funcionario) {
		int indice = this.getIndice(funcionario.getNome());
		
		if(indice != this.indice) {
			this.funcionarios[indice] = funcionario;
		}

	}

	@Override
	public void remover(String nome) {
		int indice = this.getIndice(nome);
		
		if(indice != this.indice) {
			this.indice = this.indice - 1;
			this.funcionarios[indice] = this.funcionarios[this.indice];
			this.funcionarios[this.indice] = null;
		}
		
	}

	@Override
	public Funcionario procurar(String nome) {
		Funcionario resposta = null;
		int indice = this.getIndice(nome);
		
		if(indice != this.indice) {
			resposta = this.funcionarios[indice];
		}
		
		return resposta;
	}

	@Override
	public boolean existe(String nome) {
		int resposta = this.getIndice(nome);
		return (resposta != this.indice);
	}
	
	private int getIndice(String nome) {
		int resposta = 0;
		String nomeAtual;
		boolean achou = false;
		
		while(!achou && resposta < this.indice) {
			nomeAtual = funcionarios[resposta].getNome();
			if(nomeAtual.equals(nome)) {
				achou = true;
			}
			else {
				resposta++;
			}
		}
		
		return resposta;
	}
	
	
	
}
