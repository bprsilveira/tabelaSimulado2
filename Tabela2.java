package tabelaSimulado2;

public class Tabela2 extends Tabela{
	
	protected int campo3;
	
	public Tabela2(String tabela, int campo1, int campo2, int campo3) {
		
		super(tabela, campo1, campo2);
		this.campo3 = campo3;
	}
	
	public int getCampo3() {
		
		return this.campo3;
	}

	public String selectFromTabela() {
		
		return super.selectFromTabela() + ", " + this.getCampo3() + " FROM " + this.getNome();
	}
	
}
