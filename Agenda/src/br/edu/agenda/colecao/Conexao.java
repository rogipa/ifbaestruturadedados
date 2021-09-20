package br.edu.agenda.colecao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
	private static Connection con;
	private static String url = "jdbc:mysql://localhost:3306/agenda";
	private static String user = "root";
	private static String pass = "123456";
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch(Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		}
	}
	
	public static Connection getConnection() {
		if(con == null) {
			try {
				con = DriverManager.getConnection(url,user, pass);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
		
	}
	
}