
public class TesteLivro {
	
	public static void main(String[] args) {
		Editora editora01 = new Editora("Livros", "livros.com");
		Livro livro01 = new Livro("As Trancas", editora01, 123);
		livro01.mostrar();
		System.out.println(livro01);
		
		Livro livro02 = new Livro("Do Rei", new Editora("Companhia", "c.com"), 80);
		System.out.println(livro02);
	}

}
