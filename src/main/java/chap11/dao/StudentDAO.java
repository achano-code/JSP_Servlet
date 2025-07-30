package chap11.dao;

import java.util.List;

public interface StudentDAO {
	Student getStudentById(int id);
	List<Student> getAllStudents();
	void createStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(int id);
}
