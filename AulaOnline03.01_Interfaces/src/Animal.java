
abstract public class Animal {
	
	private String tipo;
	private String nome;
	
	public Animal(String aTipo, String aNome) {
		this.tipo = aTipo;
		this.nome = aNome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	abstract public void fazBarulho(); 
	

}
