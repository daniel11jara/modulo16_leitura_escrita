package modulo16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class Arquivos {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//classe que cria arquivo
		File arquivo = new File("C:\\Users\\danie\\git\\modulo16_leitura_escritab\\Modulo16\\src\\modulo16\\arquivo.tx");
		
		if (!arquivo.exists()) {//se o arquivo nao existir
			arquivo.createNewFile();//vai criar um novo 
		}
		
		//classe que escreve no arquivo
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		for (int i = 1; i<=10; i++) {
			escrever_no_arquivo.write("Texto da minha linha " + i + "\n");
			
		}
		
		
		
		escrever_no_arquivo.flush();//usado para persistir
		escrever_no_arquivo.close();//fechando o arquivo
		
		
	}

}
