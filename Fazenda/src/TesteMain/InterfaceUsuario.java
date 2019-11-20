package TesteMain;

import java.util.*;

import ClassesBase.*;
import Exceptions.*;
import Fachada.*;
import RegrasNegocio.*;
import Repositorios.*;

public class InterfaceUsuario {

	public static void main(String[] args) throws GadoJaCadastradoException, GadoNaoExisteException,
			FuncionarioJaCadastradoException, FuncionarioNaoEncontradoException, InsumoJaCadastradoException,
			InsumoNaoCadastradoException, CultivoJaCadastradoException, CultivoNaoExisteException {
		Scanner in = new Scanner(System.in);
		boolean continuar = true;

		// Teste funcoes classe Gado
		RepositorioGados gadosRepArray = new RepositorioGadosArray(1);
		RepositorioGados gadosRepLista = new RepositorioGadosLista();
		// Teste funcoes classe Funcionarios
		RepositorioFuncionarios funcionariosRepArray = new RepositorioFuncionariosArray(1);
		RepositorioFuncionarios funcionariosRepLista = new RepositorioFuncionariosLista();
		// Teste funcoes classe Insumo
		RepositorioInsumos insumosRepArray = new RepositorioInsumosArray();
		RepositorioInsumos insumosRepLista = new RepositorioInsumosLista();
		// Teste funcoes classe Cultivo
		RepositorioCultivos cultivosRepArray = new RepositorioCultivosArray();
		RepositorioCultivos cultivosRepLista = new RepositorioCultivosLista();

		GadoCorte gadoCorte = new GadoCorte(" ", ' ', " ", false, 0);
		GadoReproducao gadoReproducao = new GadoReproducao(" ", ' ', " ", false, 0);
		Funcionario funcionarios = new Funcionario();
		Insumo insumos = new Insumo(" ", 0);
		Cultivo cultivos = new Cultivo(" ", 0, false, 0, 0);

//		 FachadaFazenda fachada = new FachadaFazenda(gadosRepArray,funcionariosRepArray, insumosRepArray, cultivosRepArray); // Inserindo em arrays
		FachadaFazenda fachada = new FachadaFazenda(gadosRepLista, funcionariosRepLista, insumosRepLista,cultivosRepLista);
		while (continuar) {
			System.out.println("Informe o que area da fazeznda deseja trabalhar:");
			System.out.println("Gado de Corte - Gado de Reproducao - Funcionarios - Insumos - Cultivo");
			String escolha = in.nextLine();

			switch (escolha) {
			case "Gado de Corte": {
				System.out.println("Informe o que deseja Fazer no gado");
				System.out.println("Inserir - Remover - Procurar - Alterar");
				escolha = in.next();
				if (escolha.equals("Inserir")) {
					System.out.println(
							"Insira brinco, genero, raca, vacina(Sim / Nao) , ano de nascimento e peso respectivamente");

					gadoCorte.setBrinco(in.next());
					gadoCorte.setGenero(in.next().charAt(0));
					gadoCorte.setRaca(in.next());
					String vacinado = in.next();
					if (vacinado.equals("Sim")) {
						gadoCorte.setVacina(true);
					} else {
						gadoCorte.setVacina(false);
					}
					gadoCorte.setAnoNascimento(in.nextInt());
					gadoCorte.setPeso(in.nextDouble());
					try {
						fachada.cadastrarGado(gadoCorte);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				else if (escolha.equals("Remover")) {

					System.out.println("Insira o brinco");

					String brinco = in.next();

					try {
						fachada.removerGado(brinco);
					} catch (Exception e) {
						e.printStackTrace();
					}

				} else if (escolha.equals("Procurar")) {

					System.out.println("Insira o brinco");

					String brinco = in.next();

					try {
						fachada.procurarGado(brinco);
					} catch (Exception e) {
						e.printStackTrace();
					}

				} else if (escolha.equals("Alterar")) {

					System.out.println(
							"Insira brinco, genero, raca, vacina(Sim / Nao), ano de nascimento e peso respectivamente");
					gadoCorte.setBrinco(in.next());
					gadoCorte.setGenero(in.next().charAt(0));
					gadoCorte.setRaca(in.next());
					String vacinado = in.next();
					if (vacinado.equals("Sim")) {
						gadoCorte.setVacina(true);
					} else {
						gadoCorte.setVacina(false);
					}
					gadoCorte.setAnoNascimento(in.nextInt());
					gadoCorte.setPeso(in.nextDouble());
					try {
						fachada.atualizarGado(gadoCorte);
					} catch (Exception e) {
						e.printStackTrace();
					}

				}

				break;
			}
			case "Gado de Reproducao": {
				System.out.println("Informe o que deseja Fazer no gado");
				System.out.println("Inserir - Remover - Procurar - Alterar");
				escolha = in.next();
				if (escolha.equals("Inserir")) {
					System.out.println(
							"Insira brinco, genero, raca, vacina(Sim / Nao), ano de nascimento e fertiidade(alta/baixa) respectivamente");

					gadoReproducao.setBrinco(in.next());
					gadoReproducao.setGenero(in.next().charAt(0));
					gadoReproducao.setRaca(in.next());
					String vacinado = in.next();
					if (vacinado.equals("Sim")) {
						gadoReproducao.setVacina(true);
					} else {
						gadoReproducao.setVacina(false);
					}
					gadoReproducao.setAnoNascimento(in.nextInt());
					gadoReproducao.setFertilidade(in.next());

					try {
						fachada.cadastrarGado(gadoReproducao);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				else if (escolha.equals("Remover")) {

					System.out.println("Insira o brinco");

					String brinco = in.next();

					try {
						fachada.removerGado(brinco);
					} catch (Exception e) {
						e.printStackTrace();
					}

				} else if (escolha.equals("Procurar")) {

					System.out.println("Insira o brinco");

					String brinco = in.next();

					try {
						fachada.procurarGado(brinco);
					} catch (Exception e) {
						e.printStackTrace();
					}

				} else if (escolha.equals("Alterar")) {

					System.out.println(
							"Insira brinco, genero, raca, vacina(Sim / Nao), ano de nascimento e fertilidade(alta/baixa) respectivamente");
					gadoCorte.setBrinco(in.next());
					gadoCorte.setGenero(in.next().charAt(0));
					gadoCorte.setRaca(in.next());
					String vacinado = in.next();
					if (vacinado.equals("Sim")) {
						gadoCorte.setVacina(true);
					} else {
						gadoCorte.setVacina(false);
					}
					gadoCorte.setAnoNascimento(in.nextInt());
					gadoReproducao.setFertilidade(in.next());

					try {
						fachada.atualizarGado(gadoCorte);
					} catch (Exception e) {
						e.printStackTrace();
					}

				}

				break;
			}
			case "Funcionarios": {
				System.out.println("Informe o que deseja Fazer no funcionario");
				System.out.println("Inserir - Remover - Procurar - Alterar");
				escolha = in.next();
				if (escolha.equals("Inserir")) {
					System.out.println("Insira nome, contato, endereco, funcao e salario respectivamente");

					funcionarios.setNome(in.next());
					funcionarios.setContato(in.next());
					funcionarios.setEndereco(in.next());
					funcionarios.setFuncao(in.next());
					funcionarios.setSalario(in.nextDouble());

					try {
						fachada.inserirFuncionario(funcionarios);// ele n passou aqui e deveria ter passado
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else if (escolha.equals("Remover")) {
					System.out.println("Insira o nome do funcionario a ser removido");

					String nome = in.next();

					try {
						fachada.removerFuncionario(nome);
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else if (escolha.equals("Procurar")) {
					System.out.println("Insira o nome do funcionario a ser procurado");
					String nome = in.next();

					try {
						fachada.removerFuncionario(nome);
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else if (escolha.equals("Alterar")) {
					System.out.println("Insira o nome do funcionario que deseja alterar");
					funcionarios.setNome(in.next());
					funcionarios.setContato(in.next());
					funcionarios.setEndereco(in.next());
					funcionarios.setFuncao(in.next());
					funcionarios.setSalario(in.nextDouble());

					try {
						fachada.atualizarFuncionario(funcionarios);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				break;
			}
			case "Insumos": {
				System.out.println("Informe o que deseja fazer em insumos");
				System.out.println("Inserir - Remover - Procurar - Alterar");
				escolha = in.next();
				if (escolha.equals("Inserir")) {
					System.out.println("Informe item e quantidade para inserir");
					insumos.setNome(in.next());
					insumos.setQuantidade(in.nextInt());

					try {
						fachada.alterarInsumo(insumos);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				else if (escolha.equals("Remover")) {
					System.out.println("Informe item e quantidade para remover");
					insumos.setNome(in.next());
					insumos.setQuantidade(in.nextInt());
					try {
						fachada.removerInsumo(insumos);
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else if (escolha.equals("Procurar")) {
					System.out.println("Informe item para procurar");
					String item = in.next();
					try {
						fachada.procurarInsumo(item);
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else if (escolha.equals("Alterar")) {
					System.out.println("Informe item e quantidade para inserir");
					insumos.setNome(in.next());
					insumos.setQuantidade(in.nextInt());
					try {
						fachada.alterarInsumo(insumos);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				break;
			}
			case "Cultivo": {
				System.out.println("Informe o que deseja fazer em cultivo");
				System.out.println("Inserir - Remover - Procurar - Alterar");
				escolha = in.next();
				if (escolha.equals("Inserir")) {
					System.out.println(
							"Insira o  produto, quantidade, agrotoxico (Sim / Nao), irrigacao e colheita");
					cultivos.setProduto(in.next());
					cultivos.setQuantidade(in.nextInt());
					String controlado = in.next();
					if (controlado.equals("Sim")) {
						cultivos.setControlePraga(true);
					} else {
						cultivos.setControlePraga(false);
					}
					cultivos.setIrrigacao(in.nextInt());
					cultivos.setColheita(in.nextInt());

					try {
						fachada.inserirCultivo(cultivos);
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else if (escolha.equals("Remover")) {
					System.out.println("Insira o  produto, quantidade, agrotoxico(Sim/ Nao), irrigacao e colheita");
					cultivos.setProduto(in.next());
					cultivos.setQuantidade(in.nextInt());
					String controlado = in.next();
					if (controlado.equals("Sim")) {
						cultivos.setControlePraga(true);
					} else {
						cultivos.setControlePraga(false);
					}
					cultivos.setIrrigacao(in.nextInt());
					cultivos.setColheita(in.nextInt());
					try {
						fachada.removerCultivo(cultivos);
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else if (escolha.equals("Procurar")) {
					System.out.println("Informe o produto a ser procurado");
					String produto = in.next();
					try {
						fachada.procurarCultivo(produto);
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else if (escolha.equals("Alterar")) {
					System.out.println("Informe o produto a ser alterado");
					cultivos.setProduto(in.next());
					cultivos.setQuantidade(in.nextInt());
					String controlado = in.next();
					if (controlado.equals("Sim")) {
						cultivos.setControlePraga(true);
					} else {
						cultivos.setControlePraga(false);
					}
					cultivos.setIrrigacao(in.nextInt());
					cultivos.setColheita(in.nextInt());

					try {
						fachada.alterarCultivo(cultivos);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				break;
			}
			}
			System.out.println("Deseja Continuar? Sim ou Nao");
			String continua=in.nextLine();
			if (continua.equals("Nao"))
				continuar = false;

		}
	}

}
