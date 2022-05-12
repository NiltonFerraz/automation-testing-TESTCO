package tests.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.By;

public class ReadFile2 {

	public ArrayList<String> readFileTxt(String arquivo) throws InterruptedException {

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
		
		for (int a = 0; a < arrayTxt.size(); a++) {
			String line2 = arrayTxt.get(a);
			
			if (line2.substring(0, 5).equals("SENDK")) {
				System.out.println("Peguei: " + line2.substring(6));
				String valor = line2.substring(6);
				String[] valorComSplit = valor.split(",");
				
				String id = valorComSplit[0];
				String key = valorComSplit[1];
				System.out.println("id: " + id);
				System.out.println("key: " + key);
				
				sendK(id, key);
			}
			if (line2.substring(0, 7).equals("CLICKXP")) {
				System.out.println("Peguei: " + line2.substring(8));
				String xp = line2.substring(8);
				
				clickXP(xp);
			}
			if (line2.substring(0, 7).equals("CLICKID")) {
				System.out.println("Peguei: " + line2.substring(8));
				String id = line2.substring(8);
				
				clickID(id);
			}
			if (line2.substring(0, 5).equals("DRIVE")) {
				System.out.println("Peguei: " + line2.substring(6));
				String driver = line2.substring(6);
				
				driverGet(driver);
			}
			
		}
		
		return arrayTxt;
	}

	private void driverGet(String driver) {
		DriverFactory.getDriver().get(driver);
	}

	private void clickID(String id) throws InterruptedException {
		DriverFactory.getDriver().findElement(By.id(id)).click();
		Thread.sleep(3000);
	}

	private void clickXP(String xp) throws InterruptedException {
		DriverFactory.getDriver().findElement(By.id(xp)).click();
		Thread.sleep(3000);
	}

	private void sendK(String id, String key) {
		DriverFactory.getDriver().findElement(By.id(id)).sendKeys(key);
	}
}
