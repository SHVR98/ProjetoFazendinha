package ClassesBase;

public class Cultivo {

	//sorgo e organicos
	private String produto; //nome do produto cultivado
	private int quantidade; //quantidade cultivada
	//private String tipo; //sorgo ou organico?
	private boolean controlePraga;
	private int irrigacao;
	private int colheita;
	
	public Cultivo (String produto, int quantidade, boolean controlePraga, int irrigacao, int colheita){
		this.produto = produto;
		this.quantidade = quantidade;
		this.controlePraga = controlePraga;
		this.irrigacao = irrigacao;
		this.colheita = colheita;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getQuantidade(){
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public boolean getControlePraga(){
		return controlePraga;
	}
	public void setControlePraga(boolean controlePraga) {
		this.controlePraga = controlePraga;
	}
	public int getIrrigacao(){
		return irrigacao;
	}
	public void setIrrigacao(int irrigacao) {
		this.irrigacao = irrigacao;
	}
	public int getColheita(){
		return colheita;
	}
	public void setColheita(int colheita) {
		this.colheita = colheita;
	}

}
