import java.sql.*;

public class TestDB {
	public static void main(String[] args) {
		Conection con = new Conection();
		Consulta consulta = new Consulta();
		consulta.setCon(con.getCon());
		
		consulta.Consulta("SELECT * FROM PLSQL.EQUIPO", 2);
		
		
		
	}
}
