
public class Veterinario {
	
	
	public static void curar(Animal animal) {
		
		System.out.println("---------------------------");
		System.out.println(animal.getNome() + " deu entrada no veterinario");
		
		if(animal.isDoente() == false) {
			System.out.println(animal.getNome() + " nao esta doente");
			System.out.println("---------------------------");
			return;
		}
		
		System.out.println("Alimentando animal " + animal.getNome());
		animal.comer("racao");
		
		System.out.println("Aplicando medicamento em " + animal.getNome());
		animal.fazBarulho();
		animal.curar();
		animal.dormir();
		
		if(animal.isDoente() == false) {
			System.out.println(animal.getNome() + " esta curando pode levar para casa");
		}
		System.out.println("---------------------------");
		
		return;
		
	}

}
