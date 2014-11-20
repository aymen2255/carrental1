package fr.treeptik.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import fr.treeptik.exception.DAOException;

public class ConnectionUtils {
	
	private static Connection connection;
	
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		if(connection==null || connection.isClosed()){
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Location";
		connection = DriverManager.getConnection(url, "root", "root");
		connection.setAutoCommit(false);
		}
		return connection;
	}
	public static void commitTX() throws DAOException{
		try {
			getConnection().commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new DAOException(e, "erreur commit TX");
		}
	}
}
