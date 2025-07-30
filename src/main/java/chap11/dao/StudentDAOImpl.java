package chap11.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import chap11.dao.dbaccess.DBConnecter;

public class StudentDAOImpl implements StudentDAO{
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/school";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASSWORD = "root";
	private DBConnecter dbConnecter = null;
	PreparedStatement statement = null;
	ResultSet resultSet = null;
	
	public StudentDAOImpl() {
		dbConnecter = new DBConnecter(JDBC_DRIVER, JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		dbConnecter.init();
	}
	
	private Connection connect() {
		statement = null;
		resultSet = null;
		Connection connection = null;
		connection = dbConnecter.connect();
		return connection;
	}
	
	private void close() {
		try {
			if(resultSet != null && !statement.isClosed()) {
				resultSet.close();
			}
		} catch (SQLException e) {
			throw new RuntimeException("ResultSetのクローズ処理に失敗しました");
		}
		try {
			if(statement != null && !statement.isClosed()) {
				statement.close();
			}
		} catch (SQLException e) {
			throw new RuntimeException("Statementのクローズ処理に失敗しました");
		}
		dbConnecter.close();
	}
	
	@Override
	public Student getStudentById(int id) {
		Student student = null;
		try {
			Connection connection = connect();
			String query = "SELECT * FROM student WHERE id = ?;";
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			resultSet = statement.executeQuery();
			if (resultSet.next()) {
				String name = resultSet.getString("name");
				int grade = resultSet.getInt("grade");
				student = new Student(id, name, grade);
			}
			close();
		} catch(SQLException e) {
			throw new RuntimeException("クエリの実行に失敗しました");
		}
		return student;
	}
	
	@Override
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<Student>();
		try {
			Connection connection = connect();
			String query = "SELECT id,name,grade FROM student ORDER BY id";
			statement = connection.prepareStatement(query);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			int grade = resultSet.getInt("grade");
			students.add(new Student(id,name,grade));
		}
		close();
		} catch (SQLException e) {
			throw new RuntimeException("クエリの実行に失敗しました");
		}
		return students;
	}
	
	@Override
	public void createStudent(Student student) {
		try {
			Connection connection = connect();
			String query = "INSERT INTO student (id, name, grade) VALUES (?, ?, ?)";
			statement = connection.prepareStatement(query);
			statement.setInt(1, student.getId());
			statement.setString(2, student.getName());
			statement.setInt(3, student.getGrade());
			statement.executeUpdate();
			close();
		} catch (SQLException e) {
			throw new RuntimeException("クエリの実行に失敗しました");
		}
	}
	
	@Override
	public void updateStudent(Student student) {
		try{
			Connection connection = connect();
			String query = "UPDATE student SET name = ?, grade = ? WHERE id = ?";
			statement = connection.prepareStatement(query);
			statement.setString(1, student.getName());
			statement.setInt(2, student.getGrade());
			statement.setInt(3, student.getId());
			statement.executeUpdate();
			close();
		} catch (SQLException e) {
			throw new RuntimeException("クエリの実行に失敗しました");
		}
	}

	@Override
	public void deleteStudent(int id) {
		try{
			Connection connection = connect();
			String query = "DELETE FROM student WHERE id = ?";
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			statement.executeUpdate();
			close();
		} catch (SQLException e) {
			throw new RuntimeException("クエリの実行に失敗しました");
		}
	}
}
