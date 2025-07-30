package chap10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sample1003 {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/school";
		String user = "root";
		String password = "root";
		try {
			DBConnecter dbConnecter = new DBConnecter(driver, url, user, password);
			dbConnecter.init();
			System.out.println("データベース初期化");
			Connection connection = dbConnecter.Connect();
			System.out.println("データベース接続");
			query(connection);
			dbConnecter.close();
			System.out.println("データベース切断");
		} catch (RuntimeException e) {
			e.printStackTrace();
		}

	}
	
	private static void create(Connection connection) {
		PreparedStatement statement = null;
		try {
			String sql = "INSERT INTO student(id,name,grade) VALUES(?,?,?);";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, 3005);
			statement.setString(2, "木下日向");
			statement.setInt(3,3);
			int result = statement.executeUpdate();
			System.out.print("登録件数" + result);
		} catch(SQLException e) {
			System.out.print("クエリの実行に失敗しました" + e);
		} finally {
			try {				
				if (statement != null && !statement.isClosed()) {
					statement.close();
				}
			} catch (SQLException e) {
				
			}
		}
	}
	private static void update(Connection connection) {
		PreparedStatement statement = null;
		try {
			String sql = "UPDATE student SET name=? WHERE id=?;";
			statement = connection.prepareStatement(sql);
			statement.setString(1, "山本太郎");
			statement.setInt(2,3004);
			int result = statement.executeUpdate();
			System.out.print("登録件数" + result);
		} catch(SQLException e) {
			System.out.print("クエリの実行に失敗しました" + e);
		} finally {
			try {				
				if (statement != null && !statement.isClosed()) {
					statement.close();
				}
			} catch (SQLException e) {
				
			}
		}
	}
	private static void delete(Connection connection) {
		PreparedStatement statement = null;
		try {
			String sql = "DELETE FROM student WHERE id=?";;
			statement = connection.prepareStatement(sql);
			statement.setInt(1,3004);
			int result = statement.executeUpdate();
			System.out.print("登録件数" + result);
		} catch(SQLException e) {
			System.out.print("クエリの実行に失敗しました" + e);
		} finally {
			try {				
				if (statement != null && !statement.isClosed()) {
					statement.close();
				}
			} catch (SQLException e) {
				
			}
		}
	}
	
	public static void query(Connection connection) {
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
		String query = "SELECT * FROM student;";
		statement = connection.prepareStatement(query);
		resultSet = statement.executeQuery();
		
		while(resultSet.next()) {
			int id = resultSet.getInt("id");
			System.out.println(id);
		}
		} catch (SQLException e) {
			
		} finally {
			try {				
				if(resultSet != null && !resultSet.isClosed()) {
					resultSet.close();
				}
				if (statement != null && !statement.isClosed()) {
					statement.close();
				}
			} catch (SQLException e) {
				
			}
		}
	}

}
