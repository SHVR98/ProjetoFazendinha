package Repositorios;
import ClassesBases.Cultivo;

public class RepositorioLista implements RepositorioCultivo {
	
	private Cultivo cultivo ;
	private RepositorioLista next;
	
	public  RepositorioLista (){
		this.cultivo = null;
		this.next = null;
	}
	
	public void Inserir (Cultivo cultivo) {
		
		if(this.next == null) {
			this.cultivo = cultivo;
			this.next = new RepositorioLista();
		}
		else {
			this.next.Inserir(cultivo);
		}
	}
	public void Remover (Cultivo cultivo) {
		if (this.cultivo != null && this.cultivo.getProduto().equals(cultivo)) {
			this.cultivo = this.next.cultivo;
			this.next = this.next.next;
		}
		else if (this.cultivo != null) {
			this.next.Remover(cultivo);
		}
	}
	public String Alterar(Cultivo cultivo) {
		String resposta = "Produto nao alterado!";
		if (this.cultivo != null && this.cultivo.getProduto().equals(cultivo)) {
			this.cultivo = cultivo;
			resposta = "Produto alterado";
		}
		else if (this.cultivo != null) {
			this.next.Alterar(cultivo);
		}
		return resposta;
		
	}
	public boolean Existe (String produto) {
		boolean existe = false;
		if (this.cultivo != null && this.cultivo.getProduto().equals(produto)) {
			existe = true;
		}
		else if (this.cultivo != null) {
			return this.next.Existe(produto);
		}
		return existe;
	}
	public Cultivo Procurar(String produto) {
	
		//String resposta = "Produto nao encontrado";
		if (this.cultivo != null && this.cultivo.getProduto().equals(produto)) {
			return this.cultivo;
		}
		else{
			return this.next.Procurar(produto);
		}

	}
}

