package RegrasNegocio;

import ClassesBase.Cultivo;
import Repositorios.*;
import Exceptions.*;

public class CadastroCultivo {
	private RepositorioCultivos cultivos;

	public void inserirCultivo(Cultivo cultivo) throws CultivoJaCadastradoException {
		if (cultivos.existeCultivo(cultivo.getProduto())) {
			throw new CultivoJaCadastradoException();
		} else {
			cultivos.inserirCultivo(cultivo);
		}
	}

	public void removerCultivo(Cultivo cultivo) throws CultivoJaCadastradoException {
		if (cultivos.existeCultivo(cultivo.getProduto())) {
			cultivos.removerCultivo(cultivo);
		} else {
			throw new CultivoJaCadastradoException();
		}
	}

	public Cultivo procurarCultivo(String produto) throws CultivoJaCadastradoException {
		if (cultivos.existeCultivo(produto)) {
			return cultivos.procurarCultivo(produto);
		} else {
			throw new CultivoJaCadastradoException();
		}
	}

	public String alterarCultivo(Cultivo cultivo) throws CultivoJaCadastradoException {
		String a = "produto nao alterado";
		if (cultivos.existeCultivo(cultivo.getProduto())) {
			cultivos.alterarCultivo(cultivo);
		} else {
			throw new CultivoJaCadastradoException();
		}
		return a;
	}
}
