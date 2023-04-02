package Arquivos;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setEmail("pessoa1@gmail.com");
		pessoa1.setIdade(50);
		pessoa1.setNome("rubens");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setEmail("pessoa2@gmial.com");
		pessoa2.setIdade(56);
		pessoa2.setNome("carlos");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setEmail("pessoa3@gmail.com");
		pessoa3.setIdade(28);
		pessoa3.setNome("Jessica");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		//classe que cria arquivo
		File arquivo = new File("C:\\Users\\danie\\git\\modulo16_leitura_escritab\\Modulo16\\src\\modulo16\\arquivo.tx");
		
		if (!arquivo.exists()) {//se o arquivo nao existir
			arquivo.createNewFile();//vai criar um novo 
		}
		
		//classe que escreve no arquivo
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
				
		for (Pessoa p : pessoas) {
			escrever_no_arquivo.write(p.getNome() + ";" + p.getEmail() + p.getIdade());
		} 
		
		
		for (int i = 1; i<=10; i++) {
			escrever_no_arquivo.write("Texto da minha linha " + i + "\n");
			
		}
		
		
		
		escrever_no_arquivo.flush();//usado para persistir
		escrever_no_arquivo.close();//fechando o arquivo
		
		
	}

}
