package testeSimulado;

import java.util.ArrayList;

public class Teste {
	
	public String nome;
	public ArrayList<Escritorio> es;
	
	public Teste(String nome) {
		
		this.nome = nome;
		this.es = new ArrayList<Escritorio>();
	}
	
	public String getEscritorio() {
		
		return this.nome;
	}
	
	public void adicionaEscritorio(Escritorio e) {
		
		if(e != null) {
			
			es.add(e);
		}
	}
	
	public void mostraEscritorio() {
		
		for(Escritorio e: es)
			
			System.out.println(e.mostrar());
						
	}

}
