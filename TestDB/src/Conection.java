import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {
	private Connection con;
	public Conection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String pwd = "12102012";
			String usr = "SYSTEM";
			con = DriverManager.getConnection(url, usr, pwd);
			System.out
					.println("- Conexión a ORACLE establecida - , Bienvenido "
							+ usr);
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getCon() {
		return con;
	}
}
