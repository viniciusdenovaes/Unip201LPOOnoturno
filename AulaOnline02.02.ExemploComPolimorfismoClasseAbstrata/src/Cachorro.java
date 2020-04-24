
public class Cachorro extends Animal{

	public Cachorro(String aNome) {
		super("Cachorro", aNome);
	}
	
	@Override
	public void comer(String comida) {
		super.comer(comida);
		System.out.println(getNome() + " come " + comida + " com ossinho");
	}
	
	@Override
	public void fazBarulho() {
		System.out.println("Au Au Au");
	}
	

}
