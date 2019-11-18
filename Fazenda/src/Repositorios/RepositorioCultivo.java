package Repositorios;
import ClassesBases.Cultivo;

public interface RepositorioCultivo {
	public void Inserir (Cultivo cultivo);
	public void Remover (Cultivo cultivo);
	public String Alterar (Cultivo cultivo);
	public boolean Existe (String produto);
	public Cultivo Procurar(String produto);
	

}
