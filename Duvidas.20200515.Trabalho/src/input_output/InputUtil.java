package input_output;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import entidade.Funcionario;

public class InputUtil {
	
	public static ArrayList<Funcionario> getFuncionarios() {
		
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			
			is = new FileInputStream("files/funcionarios.csv");
			isr = new InputStreamReader(is, StandardCharsets.UTF_8);
			br = new BufferedReader(isr);
			String linha;
			while( ( linha = br.readLine() ) !=null) {
				
				String[] palavras = linha.split("\\|");
				
				String id = palavras[0];
				String nome = palavras[1];
				double salario = Double.parseDouble(palavras[2]);
				
				Funcionario funcionario = new Funcionario(id, nome, salario);
				
				funcionarios.add(funcionario);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(is!=null) is.close();
				if(isr!=null) isr.close();
				if(br!=null) br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		return funcionarios;
		
	}

}
