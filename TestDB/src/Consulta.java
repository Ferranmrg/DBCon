import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Consulta {
	private Connection con;

	/**
	 * @param con the con to set
	 */
	public void setCon(Connection con) {
		this.con = con;
	}

	public void Consulta(String query, int columna) {
		try {
			Statement stmt = con.createStatement();
			ResultSet resul = stmt.executeQuery(query);
			while (resul.next())
				System.out.println(resul.getString(columna));
			resul.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

}
