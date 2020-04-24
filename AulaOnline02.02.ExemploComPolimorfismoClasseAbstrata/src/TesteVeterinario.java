
public class TesteVeterinario {
	
	public static void main(String[] args) {
		
		Animal gato = new Gato("jose");
		Veterinario.curar(gato);
		gato.comer("lixo");
		Veterinario.curar(gato);
		
		System.out.println("+++++++++++++++++++++++++++++++");
		Animal cachorro = new Cachorro("brutus");
		cachorro.comer("lixo");
		Veterinario.curar(cachorro);
		
//		System.out.println("+++++++++++++++++++++++++++++++");
//		Animal raposa = new Raposa("fox");
//		raposa.comer("lixo");
//		Veterinario.curar(raposa);
		
		System.out.println("+++++++++++++++++++++++++++++++");
		Animal cachorro01 = new Cachorro("Rex");
		cachorro01.comer("lixo");
		Veterinario.curar(cachorro01);
		
		System.out.println("+++++++++++++++++++++++++++++++");
		Animal cachorro02 = new Cachorro("Vacilo");
		cachorro02.comer("lixo");
		Veterinario.curar(cachorro02);
	}

}
