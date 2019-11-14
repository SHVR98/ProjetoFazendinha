package Repositorios;
import ClassesBases.Insumo;

public interface RepositorioInsumos 
{
	// Metodos a serem implementados em "InsumoLIsta" e "InsumoArray"
	void Inserir(Insumo insumo);	// Metodo para Inserir
	String Remover(Insumo insumo);	// Metodo para Remover e enviar uma mensagem sobre a executacao do comando
	String Alterar (Insumo insumo);	// Metodo para Alterar dados de insumoLista e InsumoArray
	boolean Existe (String item);	// Metodo Procurando A existencia de um Item da classe Insumo
	Insumo Procurar (String item);	// Metodo Procurando item
	Insumo Listar ();				// Metodo para imprimir todos os Insumos de InsumoLista e InsumoArray
}
