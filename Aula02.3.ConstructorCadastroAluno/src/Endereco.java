
public class Endereco {
	String rua;
	int numero;
	
	Endereco(String rua, int numero) {
		this.rua = rua;
		this.numero = numero;
	}
	
	void display() {
		System.out.println("Rua: " + this.rua);
		System.out.println("Numero: " + this.numero);
	}
}
