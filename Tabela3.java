package tabelaSimulado2;

public class Tabela3 extends Tabela {
	
	public int campo3, campoN;
	
	public Tabela3(String tabela, int campo1, int campo2, int campo3, int campoN) {
		
		super(tabela, campo1, campo2);
		this.campo3 = campo3;
		this.campoN = campoN;
	}
	
	public int getCampo3() {
		
		return this.campo3;
	}
	
		
	public int getCampoN() {
		
		return this.campoN;
	}
	
public String selectFromTabela() {
		
		return super.selectFromTabela() + ", " + this.getCampo3() + ", " + this.getCampoN() + " FROM " + this.getNome();
	}

}
