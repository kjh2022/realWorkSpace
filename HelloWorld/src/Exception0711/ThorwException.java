package Exception0711;

import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 예외 떠넘기기
 */
public class ThorwException {
	public static void main(String[] args) {
		
		try {
			method1();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void method1() throws ClassNotFoundException, SQLException {
		Class.forName("java.lang.String");
		
		DriverManager.getConnection("", "", "");
	}

}
