
public class Nome {
	String primeiroNome;
	String sobrenome;
	
	Nome(String primeiroNome, String sobrenome) {
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
	}
	
	void display() {
		System.out.println("Nome: " 
				+ this.primeiroNome
				+ " " 
				+ this.sobrenome);
	}
}
