
public class Funcionario {
	
	String nome;
	double salario;
	
	public Funcionario(String aNome, double aSalario) {
		this.nome = aNome;
		this.salario = aSalario;
	}
	
	double calculaSalario() {
		return this.salario;
	}
	
	void pagarSalario() {
		System.out.println("O funcionario " + this.nome);
		System.out.println("  deve receber " + this.calculaSalario());
	}
	
	public String toString() {
		String resposta = "";
		resposta += "Nome: " + this.nome + "\n";
		resposta += "Salario " + this.salario + "\n";
		return resposta;
	}

}
