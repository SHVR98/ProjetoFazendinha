package Repositorios;

import ClassesBases.Insumo;

public class InsumoArray implements RepositorioInsumos 
{
	private Insumo[] array;
	private int index;
	
	public void InsumoArray()	// Lista padrão (Construtor)
	{
		this.array = new Insumo[1];
		this.index = 0;
	}

	public void Inserir(Insumo insumo) // inserindo e aumentando o tamanho do array
	{
		if(index == array.length)
		{
			Insumo[] arrayArmazenar = new Insumo[index+1];
			for(int i=0; i<array.length; i++)
			{
				arrayArmazenar[i] = array[i];
			}
			this.array=arrayArmazenar;
		}
		this.array[index] = insumo;
		index++;
	}

	public String Remover(Insumo insumo) 	// pedir ajuda monitores
	{
		for(int i=0; i<array.length; i++)
		{
			if(this.array[i].getNome()==insumo.getNome()){
				for(int j = i+1; j < array.length;j++) {
					if(j == array.length-1) {
						array[j] = null;
					}
					array[j-1] = array[j];
				}
			}
		}
		return null;
	}


	public String Alterar(Insumo insumo)  // alterando caso o item seja encontrado
	{
		String resposta = "Item Não Encontrado";
		for(int i=0; i<array.length; i++)
		{
			if(array[i].getNome() == insumo.getNome())
			{
				array[i] = insumo;
				resposta = "Item Alterado Com Sucesso";
			}
		}

		return resposta;
	}

	public boolean Existe(String item) 
	{
		boolean resposta = false;
		for(int i=0; i<array.length; i++)
		{
			if(this.array[i].getNome() == item)
			{
				i = array.length+1;		// caso entre , atende o criterio de parada, com i sendo maior que o array
				resposta = true;
			}
		}
		return resposta;
	}

	public Insumo Procurar(String item) 
	{
		Insumo resposta = null;
		for(int i=0; i<array.length; i++)
		{
			if(this.array[i].getNome() == item)
			{
				resposta = array[i];
			}
		}
		return resposta;
	}
}
