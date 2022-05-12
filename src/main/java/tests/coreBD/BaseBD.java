package tests.coreBD;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class BaseBD {

	public void criarPastas(String dir) {
		File directory = new File(dir);
		if (!directory.exists()) {
			new File(dir).mkdirs();
		} else {
			System.out.println("Directory exists!!!");
		}
	}
	
	public File criarArquivo(String dir, String file) throws IOException {
		File arquivo = new File(dir, file);
		
		if (arquivo.exists()) {
			System.out.println("File exists!!!");
			arquivo.delete();
			arquivo.createNewFile();
		}
		return arquivo;
	}
	
	// Abrir o arquivo após salvar
	public void abrirArquivo(String dir, String file) {
		File fileOpen = new File(dir, file);
		try {
			Desktop.getDesktop().open(fileOpen);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
