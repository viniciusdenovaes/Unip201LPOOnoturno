
public class Editora {
	
	String nome;
	String site;
	
	Editora(String aNome, String aSite){
		this.nome = aNome;
		this.site = aSite;
	}
	
	void mostrar() {
		System.out.println("Editora:");
		System.out.println("Nome: " + this.nome);
		System.out.println("Site: " + this.site);
	}
	
	@Override
	public String toString() {
		String res = "";
		res += "Editora:\n";
		res += "Nome: " + this.nome + "\n";
		res += "Site: " + this.site + "\n";
		return res;
	}

}
