package chap11;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chap11.dao.Student;
import chap11.dao.StudentDAO;
import chap11.dao.StudentDAOImpl;

/**
 * Servlet implementation class Sample1101
 */
@WebServlet("/Sample1101")
public class Sample1101 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDAO studentDAO = new StudentDAOImpl();
		List<Student> students = studentDAO.getAllStudents();
		request.setAttribute("students", students);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/chap11/student_list.jsp");
		dispatcher.forward(request, response);
	}

}
