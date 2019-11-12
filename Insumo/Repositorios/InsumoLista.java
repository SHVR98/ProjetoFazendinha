package Repositorios;
import ClassesBases.Insumo;

public class InsumoLista implements RepositorioInsumos 
{
	private Insumo insumo = new Insumo(null, 0); // puxando a classe insumo (gets e sets)
	private InsumoLista proximo;
	
	public void InsumoLista() // Lista padrão
	{
		this.insumo = null;
		this.proximo = null;
	}
	
	public void Inserir(Insumo insumo)  // Metodo Inserindo Item
	{		
		if(this.insumo == null)
		{
			this.insumo = insumo;
			this.proximo = new InsumoLista();
		}
		else
		{
			this.proximo.Inserir(insumo);
		}
	}

	public String Remover(Insumo insumo) // Removendo e Enviando resposta sobre a operacao
	{
		String resposta = "Remover o Item Não Existe";
		if(this.proximo!=null && this.insumo.equals(insumo))
		{
			this.insumo = this.proximo.insumo;
			this.proximo = this.proximo.proximo;
		
			resposta = "Insumo Removido com Sucesso";
		}
		else
		{
			this.proximo.Remover(insumo);
		}
		return resposta;
	}
	
	public String Alterar(Insumo insumo)  // Alterando e enviando mensagem sobre o procedimento
	{
		String resposta="Insumo Não Encontrado";
		if(this.insumo.getNome() == insumo.getNome())
		{
			this.insumo = insumo;
			resposta =  "Insumo Alterado Com Sucesso";
		}
		else
		{
			this.proximo.Alterar(insumo);
		}
		return  resposta;
	}

	public boolean Existe(String item) // Verificando se item existe e eviando boolean como resposta
	{
		boolean resposta = false;
		if(this.insumo.getNome() == item)
		{
			resposta = true;
		}
		else
		{
			this.proximo.Existe(item);
		}		
		return resposta;
	}
	
	public Insumo Procurar(String item) // Procurando elemento da lista
	{
		Insumo elemento = null;
		if(this.insumo!=null && this.insumo.getNome()==item)
		{
			elemento = this.insumo;
		}
		else
		{
			this.proximo.Procurar(item);
		}
		return elemento;
	}

}
