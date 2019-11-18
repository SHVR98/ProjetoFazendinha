package Repositorios;

import ClassesBases.Funcionario;

public interface RepositorioFuncionarios {
	
	public void inserir(Funcionario funcionario);
	public void atualizar(Funcionario funcionario);
	public void remover(String nome);
	public Funcionario procurar(String nome);
	public boolean existe(String nome);
	
}