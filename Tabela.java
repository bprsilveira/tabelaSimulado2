package tabelaSimulado2;

public class Tabela {

	protected String tabela;
	protected int campo1, campo2, campo3;
	
	public Tabela(String tabela, int campo1, int campo2) {
		
		this.tabela = tabela;
		this.campo1 = campo1;
		this.campo2 = campo2;
	}
	
	
	public String getNome() {
		
		return this.tabela;
	}
	
	public int getCampo1() {
		
		return this.campo1;
	}
	
	public int getCampo2() {
		
		return this.campo2;
	}
	
	public int getCampo3(){		
		
		return this.getCampo3();
	}
	
	public String selectFromTabela() {
		
		return "SELECT " + this.getCampo1() + ", " + this.getCampo2();
	}
	
	
}
