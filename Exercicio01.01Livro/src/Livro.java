
public class Livro {
	
	String nome;
	Editora editora;
	int nPaginas;
	double preco;
	
	public Livro(String aNome, Editora aEditora, int aNPaginas) {
		this.nome = aNome;
		this.editora = aEditora;
		this.nPaginas = aNPaginas;
		this.preco = 1.23*this.nPaginas;
	}
	
	void mostrar() {
		System.out.println("Livro: ");
		System.out.println("Nome: " + this.nome);
		this.editora.mostrar();
		System.out.println("Numero de paginas: " + this.nPaginas);
		System.out.println("Preco: " + this.preco);
	}
	
	@Override
	public String toString() {
		String res = "";
		res += "Livro: \n";
		res += "Nome: " + this.nome + "\n";
		res += this.editora;
		res += "Paginas: " + this.nPaginas + "\n";
		res += "Preco: " + this.preco + "\n";
		return res;
	}

}
