package address;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * To create 
 * @author Hao Do
 *
 */
public class DBConnection {
	
	// Attributes..
	
	private static final String HOST = "127.0.0.1";
	private static final int PORT = 3306;
	private static final String USERNAME = "root";
	private static final String DATABASE = "addressdb";
	private static final String PASSWORD = "S4lt5you*";
	private Connection connection;
	private Statement statement;

	/**
	 * Constructor to create database.
	 *
	 * @throws SQLException sql
	 */
	public DBConnection() throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {}
		connection = DriverManager.getConnection("jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE, USERNAME, PASSWORD);
		statement = connection.createStatement();

	}
	
	/**
	 * To execute the update.
	 * 
	 * @param sql field
	 * @throws SQLException sql
	 */
	public void execute(String sql) throws SQLException {
		
		statement.execute(sql);
		
	}
	
	/**
	 * To execute the query to get data.
	 * 
	 * @param sql field
	 * @return result set
	 * @throws SQLException sql
	 */
	public ResultSet executeQuery(String sql) throws SQLException {
		
		return statement.executeQuery(sql);
		
	}
	
	/**
	 * It will return the last id in the table.
	 * 
	 * @param table db
	 * @return last id
	 * @throws SQLException sql
	 */
	public int getLastID(String table) throws SQLException {
		
		ResultSet result = statement.executeQuery("SELECT * FROM "+table);
		int id = 1;
		while(result.next()) {
			id = result.getInt(1);
		}
		return id;
		
	}
	
	/**
	 * It will close the db connection.
	 * 
	 * @throws SQLException sql
	 */
	public void closeConnection() throws SQLException {

		this.statement.close();
		connection.close();
		
	}
	
}
