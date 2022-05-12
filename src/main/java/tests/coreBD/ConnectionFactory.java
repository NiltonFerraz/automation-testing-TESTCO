package tests.coreBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() throws ClassNotFoundException {

		//Carrega o drive nativo
		Class.forName("oracle.jdbc.driver.OracleDriver");

		try {
			return DriverManager
					.getConnection(
							"jdbc:oracle:thin:@172.31.20.4:1521/ODT19",
							"rcvry",
							"MUr2dJhpVQ");
							//Protocolo:Drive:LocalizacaodoBD
							/* Na linha de comando acima deve ser substituido as variaveis <host name>,
							 * <porta e <sid> pelas configuracoes de seu servidor oracle
							 */
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
