package Repositorios;
import ClassesBases.Cultivo;

public class RepositorioArray implements RepositorioCultivo {
	
	private Cultivo[] array;
	private int indice;
	
	public void CultivoArray(int tamanho) {
		this.array = new Cultivo[tamanho];
		this.indice = 0;
	}
	public void Inserir (Cultivo cultivo) {
		for (int i=0; i < array.length; i++) {
			if(array[i] == null) {
				array[i] = cultivo;
				i = array.length + 1;
			}
		}
	}
	public void Remover (Cultivo cultivo) {
		for (int i=0; i < array.length; i++) {
			if(array[i].getProduto().equals(cultivo)) {
				array[i] = null;
			}
			
		}
	}
	public String Alterar (Cultivo cultivo) {
		String resposta = "Produto nao alterado!";
		for (int i=0; i < array.length; i++) {
			if(array[i].getProduto().equals(cultivo)) {
				array[i] = cultivo;
				resposta = "Produto alterado com sucesso!";
			}
		}
		return resposta;
	}
	public boolean Existe (String produto) {
		boolean existe = false;
		for (int i=0; i < array.length; i++) {
			if(array[i].getProduto().equals(produto)) {
				existe = true;
			}
		}
		return existe;
	}
	public Cultivo Procurar(String produto) {
		Cultivo prod = null;
		String resposta = "Produto nao encontrado";
		for (int i=0; i < array.length; i++) {
			if(array[i].getProduto().equals(produto)) {
				array[i] = null;
				i = array.length + 1;
			}
		}
		return prod;
	}
}
