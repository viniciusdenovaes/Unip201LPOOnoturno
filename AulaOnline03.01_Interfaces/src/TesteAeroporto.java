
public class TesteAeroporto {
	
	public static void main(String[] args) {
		
		Pato pato = new Pato("Donaldo");
		Aeroporto.fazVoar(pato);
		
		Aviao aviao = new Aviao();
		Aeroporto.fazVoar(aviao);
		
		SuperMan superman = new SuperMan();
		Aeroporto.fazVoar(superman);
		
	}

}
