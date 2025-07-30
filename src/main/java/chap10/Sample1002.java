package chap10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample1002 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("ドライバーロードに成功しました");
		} catch(ClassNotFoundException e) {
			System.out.println("ドライバーロードに失敗しました");
		}
		
		Connection connection = null;
		try {
			String url = "jdbc:mysql://localhost:3306/school";
			String user = "root";
			String password = "root";
			connection =  DriverManager.getConnection(url, user, password);
			System.out.println("データベースの接続に成功しました");
		} catch (SQLException e) {
			System.out.println("データベースの接続に失敗しました");
		} finally {
			try {
				if (connection != null && !connection.isClosed()) {
					connection.close();
					System.out.println("データベースの切断に成功しました");
				}
			} catch  (SQLException e) {
				System.out.println("データベースの切断に失敗しました");				
			}
		}

	}

}
