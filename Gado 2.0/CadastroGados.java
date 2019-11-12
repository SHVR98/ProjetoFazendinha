public class CadastroGados {
private RepositorioGadosArray gados;

public void cadastrar(Gado gado) throws ExceptionGadoJaCadastrado {
	if(!gados.existeGado(gado.getBrinco())){
		gados.inserirGado(gado);
		
	}
	else {
	//chamar Excecao
	}
}
}