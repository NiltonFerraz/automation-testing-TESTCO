package en.values;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Test;

import tests.coreBD.ConnectionFactory;

public class TestSelectEditValues {

	@Test
	public void initialize( ) {
		
		String query = ("select * from mov, mov_vals \r\n"
				+ "where mvid = msid an mvid = 'MODCT'\r\n"
				+ "and mov_vals.mscode = 15");
		
		String dir = "C:\\Users\\nilton.ferraz\\TestesTBG\\Engine\\Values\\";
		String file = "exclude.csv";
		
		try {
			Connection con = new ConnectionFactory().getConnection();
			System.out.println("Conexão aberta!!!");
			
			DatabaseMetaData dma = con.getMetaData();
			System.out.println("\nConnected to " + dma.getURL());
			System.out.println("Driver         " + dma.getDriverName());
			System.out.println("Version        " + dma.getDriverVersion());
			System.out.println("");
			
			// Abre a conexao com o BD
			Statement stmt = con.createStatement();
			
			// Executa a query SQL
			ResultSet rs = stmt.executeQuery(query);
			
			ResultSetMetaData meta = rs.getMetaData(); //pega nome cabeçalho
			
			//Imprime o resultado da query SQL
			int contador = 0;
			
			while (rs.next()) {
//				String timeStamp = new SimpleDateFormat("dd/MM/yyy HH:mm:ss").format(Calendar.getInstance().getTime());
				
				System.out.println(rs.getString(1) + " " + rs.getString(2));
				contador++;
				
				// gravar
				File arquivo = new File(dir, file);
				if(arquivo.exists()) {
					arquivo.delete();
					arquivo.createNewFile();
				}
				
				FileWriter arq = new FileWriter(new File(dir, file), true);
				
				PrintWriter gravarArq = new PrintWriter(arq);
				gravarArq.printf(
						meta.getColumnName(1) + ";"
						+ meta.getColumnName(2) + ";"
						+ meta.getColumnName(3) + ";"
						+ meta.getColumnName(4) + ";"
						+ meta.getColumnName(5) + ";"
						+ meta.getColumnName(6) + ";"
						+ meta.getColumnName(7) + ";"
						+ meta.getColumnName(8) + ";"
						+ meta.getColumnName(9) + ";"
						+ "%n");
				
				gravarArq.printf(
						rs.getString(1) + ";"
						+ rs.getString(2) + ";"
						+ rs.getString(3) + ";"
						+ rs.getString(4) + ";"
						+ rs.getString(5) + ";"
						+ rs.getString(6) + ";"
						+ rs.getString(7) + ";"
						+ rs.getString(8) + ";"
						+ rs.getString(9) + ";"
						+ "%n");
				
				arq.close();
			}
			
			System.out.println("Total de registros: " + contador);
			
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException ex) {
			System.out.println("\n*** SQLException caught ***\n");
			while (ex != null) {
				System.out.println("SQLState: " + ex.getSQLState());
				System.out.println("Message:  " + ex.getMessage());
				System.out.println("Vendor:   " + ex.getErrorCode());
				ex = ex.getNextException();
				System.out.println("");
			}
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
		}
	}
}
