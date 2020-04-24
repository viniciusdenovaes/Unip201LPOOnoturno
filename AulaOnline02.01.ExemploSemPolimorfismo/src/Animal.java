
public class Animal {
	
	private String tipo;
	private String nome;
	private boolean doente;
	
	public Animal(String aTipo, String aNome) {
		this.tipo = aTipo;
		this.nome = aNome;
		this.doente = false;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String aNome) {
		this.nome = aNome;
	}
	
	public boolean isDoente() {
		return this.doente;
	}
	
	public void curar() {
		this.doente = false;
	}
	
	public void comer(String comida) {
		if(comida.equals("lixo")) {
			this.doente = true;
			System.out.println(getNome() + " comeu lixo e ficou doente");
		} else {
			if(this.tipo.equals("Gato")) {
				System.out.println(getNome() + " come atum");
			}
			else if(this.tipo.equals("Cachorro")) {
				System.out.println(getNome() + " come ossinho");
			}
		
		}
	}
	
	public void fazBarulho() {
		if(this.tipo.equals("Gato")) {
			System.out.println("Miaaaaauuuu");
		}
		else if(this.tipo.equals("Cachorro")) {
			System.out.println("Au Au Au");
			return;
		}
		else {
			System.out.println("Tipo nao reconhecido");
		}
	}
	
	public void dormir() {
		System.out.println("zzzZZZzzzZZZ");
	}

}







