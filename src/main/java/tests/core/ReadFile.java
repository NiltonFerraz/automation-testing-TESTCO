package tests.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

	public ArrayList<String> readFileTxt(String arquivo) {

		ArrayList<String> arrayTxt = new ArrayList<String>();
		Scanner read = new Scanner(arquivo);
		String name = read.nextLine();

		try {
			FileReader arq = new FileReader(name);
			BufferedReader lerArq = new BufferedReader(arq);

			String line = lerArq.readLine(); // lê a primeria linha
			// variavel "linha" recebe "null" quando o processo
			// de repetição atingir o final do arquivo texto

			int i = 0;

			while (line != null) {
				arrayTxt.add(i, line);
				System.out.println(arrayTxt.get(i));
				line = lerArq.readLine(); // lê da segunda até a última linha
				i++;
			}
			arq.close();

		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s. \n", e.getMessage());
		}
		System.out.println();
		
		return arrayTxt;
	}
}
