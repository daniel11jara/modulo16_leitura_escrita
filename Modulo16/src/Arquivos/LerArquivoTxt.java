package Arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivoTxt {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//classe que faz a entrada de dados
		FileInputStream entradaArquivo = new FileInputStream(new File ("C:\\Users\\danie\\git\\modulo16_leitura_escritab\\Modulo16\\src\\modulo16\\arquivo.tx"));
		
		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
		
		//para ler o arquivo fazemos um while
		while(lerArquivo.hasNext()) {
			
			String linha = lerArquivo.nextLine();
			
			if (linha != null && !linha.isEmpty()) {//se a linha for branca
				//se a linha for diferente de nula e se for diferente de vazia, imprimir 
				System.out.println(linha);
			}
			
			
		}
	}

}
