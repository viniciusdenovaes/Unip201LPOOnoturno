
public class Gato extends Animal{

	public Gato(String aNome) {
		super("Gato", aNome);
	}

	@Override
	public void comer(String comida) {
		super.comer(comida);
		System.out.println(getNome() + " come atum");
	}
	
	@Override
	public void fazBarulho() {
		System.out.println("Miaaaaauuuu");
	}
	
}
