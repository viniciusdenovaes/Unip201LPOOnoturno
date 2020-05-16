package input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import entidade.Funcionario;

public class OutputUtil {
	
	public static void saveEmpregados(ArrayList<Funcionario> funcionarios) {
		
		OutputStream os = null;
		OutputStreamWriter osw = null;
		PrintWriter pw = null;
		
		try {
			
			os = new FileOutputStream("files/funcionarios.csv");
			osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
			pw = new PrintWriter(osw, true);
			for(Funcionario funcionario: funcionarios) {
				String linha = "";
				linha += funcionario.getId() + "|";
				linha += funcionario.getNome() + "|";
				linha += funcionario.getSalario();
				pw.println(linha);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(os!=null) os.close();
				if(osw!=null) osw.close();
				if(pw!=null) pw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
