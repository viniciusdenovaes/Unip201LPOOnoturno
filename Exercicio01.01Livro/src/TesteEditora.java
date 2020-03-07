
public class TesteEditora {
	
	public static void main(String[] args) {
		Editora editora01;
		editora01 = new Editora("Eduardo", "eduardo.com");
		editora01.mostrar();
		
		Editora editora02 = new Editora("Ana Livros", "alivros.com");
		editora02.mostrar();
		
		System.out.println(editora01);
	}

}
