
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Ana Amaral", 2000);
		Funcionario funcionario2 = new Funcionario("Bia Barbosa", 3000);
		
		System.out.println("Funcionario 1: ");
		System.out.println(funcionario1.toString());
		funcionario1.pagarSalario();
		System.out.println();
		
		System.out.println("Funcionario 2: ");
		System.out.println(funcionario2.toString());
		funcionario2.pagarSalario();
		
	}

}
