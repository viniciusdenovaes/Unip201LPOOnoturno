
public class Animal {
	
	private String tipo;
	private double peso;
	private int idade;
	private boolean isDoente;
	
	public Animal(String aTipo, double aPeso, int aIdade) {
		this.tipo = aTipo;
		this.peso = aPeso;
		this.idade = aIdade;
		
		this.isDoente = false;
	}
	
	public Animal(double aPeso, int aIdade) {
		this("Animal", aPeso, aIdade);
	}
	
	public Animal(double aPeso) {
		this.tipo = "Animal";
		this.peso = aPeso;
		this.idade = 0;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String aTipo) {
		this.tipo = aTipo;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double aPeso) {
		this.peso = aPeso;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int aIdade) {
		this.idade = aIdade;
	}
	
	public void comer(String comida) {
		System.out.println("O animal esta comendo " + comida);
		if(comida.equals("lixo")){
			this.isDoente = true;
		}
	}
	
	public void fazBarulho() {
		System.out.println("O animal esta fazendo barulho");
	}
	
	public void curar() {
		if(this.isDoente == false) {
			System.out.println("O animal nao esta doente");
			return;
		}
		this.isDoente = false;
		System.out.println("O animal esta sendo curado");
	}
	
	@Override
	public String toString() {
		String res = "";
		
		res += "Tipo: " + this.tipo + "\n";
		res += "Idade: " + this.idade + "\n";
		res += "Peso: " + this.peso + "\n";
		
		return res;
	}
	

}
