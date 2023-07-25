package app;

import java.sql.Connection;

import projectjdbc.DB;

public class program {

	public static void main(String[] args) {
		
		Connection con = DB.getConnection();
		DB.closeConnection();
	}
}
