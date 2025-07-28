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
@WebServlet("/Exercise401")
public class Exercise401 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/chap04/login.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals("root") && password.equals("root")) {
			
			request.setAttribute("username", username);
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/chap04/index.jsp");
			dispatcher.forward(request, response);	
		} else {
			request.setAttribute("message", "ユーザー名・パスワードが間違っています。");
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/chap04/login.jsp");
			dispatcher.forward(request, response);	
		}

	}

}
