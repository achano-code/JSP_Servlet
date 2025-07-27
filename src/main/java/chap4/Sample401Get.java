package chap4;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample401Get
 */
@WebServlet("/get_data")
public class Sample401Get extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sample401Get() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String param1 = request.getParameter("param1");
		String param2 = request.getParameter("param2");
		
		request.setAttribute("param1", param1);
		request.setAttribute("param2", param2);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/chap04/result.jsp");
		dispatcher.forward(request, response);
		
	}

}
