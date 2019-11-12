
public interface RepositorioGado {
	public void inserirGado(Gado gado);
	public void removerGado(String brinco) throws ExceptionGado;
	public void procurarGado(String brinco)throws ExceptionGado;
	public void atualizarGado(Gado gado)throws ExceptionGado;
	public boolean existeGado(String brinco)throws ExceptionGado;
	
}
