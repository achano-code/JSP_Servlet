package chap04;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample403Post
 */
@WebServlet("/post_params")
public class Sample403Post extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String[] languages = request.getParameterValues("languages");
		
		request.setAttribute("languages", languages);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/chap04/sample403_result.jsp");
		dispatcher.forward(request, response);
	}

}
