package chap11.dao.dbaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnecter {
	private String driver;
	private String url;
	private String user;
	private String password;
	private Connection connection;

	public DBConnecter(String driver, String url, String user, String password) {
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password = password;
	}
	
	public void init() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("ドライバーのロードに失敗しました");
		}
	}
	
	public Connection connect() {
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new RuntimeException("データベースの接続に失敗しました");
		}
		return connection;
	}
	
	public void close() {
		try {
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch (SQLException e) {
			throw new RuntimeException("接続のクローズに失敗しました");
		} finally {
			connection = null;
		}
	}
}
