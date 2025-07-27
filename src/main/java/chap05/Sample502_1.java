package chap05;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Sample501Input
 */
@WebServlet("/Sample502_1")
public class Sample502_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		session.setAttribute("param1", "abc");
		session.setAttribute("param2", 123);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/chap05/sample503_1.jsp");
		dispatcher.forward(request, response);
	}

}
