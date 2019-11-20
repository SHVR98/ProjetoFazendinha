package RegrasNegocio;

import ClassesBase.Cultivo;
import Repositorios.*;
import Exceptions.*;

public class FachadaNegocioCultivo {
	private RepositorioCultivo cultivos;

	public void Inserir(Cultivo cultivo) throws CultivoCadastradoException {
		if (cultivos.Existe(cultivo.getProduto())) {
			throw new CultivoCadastradoException();
		} else {
			cultivos.Inserir(cultivo);
		}
	}

	public void Remover(Cultivo cultivo) throws CultivoCadastradoException {
		if (cultivos.Existe(cultivo.getProduto())) {
			cultivos.Remover(cultivo);
		} else {
			throw new CultivoCadastradoException();
		}
	}

	public Cultivo Procurar(String produto) throws CultivoCadastradoException {
		if (cultivos.Existe(produto)) {
			return cultivos.Procurar(produto);
		} else {
			throw new CultivoCadastradoException();
		}
	}

	public String Alterar(Cultivo cultivo) throws CultivoCadastradoException {
		String a = "produto nao alterado";
		if (cultivos.Existe(cultivo.getProduto())) {
			cultivos.Alterar(cultivo);
		} else {
			throw new CultivoCadastradoException();
		}
		return a;
	}
}
