package projectjdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DB {

	private static Connection con = null;
	
	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")){
			Properties props = new Properties();
			props.load(fs);
			return props;
		}
		catch (IOException e) {
			throw new DBException(e.getMessage());
		}
	}
	
	public static Connection getConnection() {
		if (con == null) {
			try {
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				con = DriverManager.getConnection(url, props);
			}
			catch (SQLException e) {
				throw new DBException(e.getMessage());
			}
		}
		return con;
	}
	
	public static void closeConnection() {
		if (con != null) {
			try {
				con.close();
			}
			catch (SQLException e) {
				throw new DBException(e.getMessage());
			}
		}
	}
}
