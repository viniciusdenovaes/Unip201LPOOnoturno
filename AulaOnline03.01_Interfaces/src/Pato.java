public class Pato extends Animal implements Voaable {

	public Pato(String aNome) {
		super("Pato", aNome);
	}

	@Override
	public void fazBarulho() {
		System.out.println("Qua qua");
	}
	
	@Override
	public void voa() {
		System.out.println("Pato voando mal");
	}

	

}
