package chap09;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample902
 */
@WebServlet(
		urlPatterns={"/Sample902"},
		initParams= {
			@WebInitParam(name="param1", value="初期化"),
			@WebInitParam(name="param2", value="パラメータ")
		}
		)
public class Sample902 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String param1;
	private String param2;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		param1 = config.getInitParameter("param1");
		param2 = config.getInitParameter("param2");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("param1", param1);
		request.setAttribute("param2", param2);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/chap09/sample902.jsp");
		dispatcher.forward(request, response);
	}

}
