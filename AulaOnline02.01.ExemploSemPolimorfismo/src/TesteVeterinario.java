
public class TesteVeterinario {
	
	public static void main(String[] args) {
		
		Animal gato = new Animal("Gato", "jose");
		Veterinario.curar(gato);
		gato.comer("lixo");
		Veterinario.curar(gato);
		
		System.out.println("+++++++++++++++++++++++++++++++");
		Animal cachorro = new Animal("Cachorro", "brutus");
		cachorro.comer("lixo");
		Veterinario.curar(cachorro);
		
		System.out.println("+++++++++++++++++++++++++++++++");
		Animal raposa = new Animal("Raposa", "fox");
		raposa.comer("lixo");
		Veterinario.curar(raposa);
		
		System.out.println("+++++++++++++++++++++++++++++++");
		Animal cachorro01 = new Animal("Cacorro", "Rex");
		cachorro01.comer("lixo");
		Veterinario.curar(cachorro01);
	}

}
