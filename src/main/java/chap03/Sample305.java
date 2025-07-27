package chap03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample305
 */
@WebServlet("/Sample305")
public class Sample305 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/chap03/sample305.jsp");
		List<Employee> empList = new ArrayList<Employee>();
		empList.add( new Employee("山田太郎", 18));
		empList.add( new Employee("鈴木花子", 15));
		request.setAttribute("empData", empList);
		
		dispatcher.forward(request, response);
	}

}
