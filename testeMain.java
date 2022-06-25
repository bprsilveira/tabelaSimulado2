package testeSimulado;


public class testeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Teste t = new Teste("Teste aleatorio");
		
		Caneta c1 = new Caneta("Caneta");
		Escritorio e1 = c1;
		
				
		t.adicionaEscritorio(e1);
				
		
		Caderno cad1 = new Caderno("Caderno");
		Escritorio e2 = cad1;
		
		t.adicionaEscritorio(e2);
		
		Livro l1 = new Livro("Livro");
		Escritorio e3 = l1;
		
		t.adicionaEscritorio(e3);
		
		
		t.mostraEscritorio();		
		
		
		
	}

}
