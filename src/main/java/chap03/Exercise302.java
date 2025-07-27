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
 * Servlet implementation class Exercise302
 */
@WebServlet("/Exercise302")
public class Exercise302 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispacher = request.getRequestDispatcher("WEB-INF/chap03/exercise302.jsp");
		List<Product> products = new ArrayList<>();
		products.add(new Product("チョコレート", 200));
		products.add(new Product("クッキー", 150));
		products.add(new Product("グミ", 300));
		request.setCharacterEncoding("UTF-8");
		request.setAttribute("products", products);
		dispacher.forward(request, response);
	}

}
