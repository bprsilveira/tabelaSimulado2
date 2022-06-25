package testeSimulado;

public class Escritorio {
	
	public String nome;
	
	public Escritorio(String nome) {
		
		this.nome = nome;
	}
	
	public String getNome() {
		
		return this.nome;	
		
	}
	
	
	
	public String mostrar() {
		
		return "É um " + this.getNome();
	}
	

}
 