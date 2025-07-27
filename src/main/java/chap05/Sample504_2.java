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
@WebServlet("/Sample504_2")
public class Sample504_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		session.invalidate();
		session = request.getSession(false);
		String message = "";
		if (session == null) {
			message = "セッションがありません";
		} else {
			message = session.getId();
		}
		request.setAttribute("message", message);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/chap05/sample504_2.jsp");
		dispatcher.forward(request, response);
	}

}
