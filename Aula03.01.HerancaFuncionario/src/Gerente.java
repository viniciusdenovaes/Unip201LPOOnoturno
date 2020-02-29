
public class Gerente extends Funcionario{
	
	double bonus;

	public Gerente(String aNome, double aSalario, double aBonus) {
		super(aNome, aSalario);
		this.bonus = aBonus;
	}
	
	@Override
	double calculaSalario() {
		double resposta = this.salario + this.bonus;
		return resposta;
	}
	

}
