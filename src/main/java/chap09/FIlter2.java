package chap09;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class FIlter1
 */
@WebFilter(
		urlPatterns={"/Sample903"},
		initParams= {
			@WebInitParam(name="param1", value="message from Filter"),
			@WebInitParam(name="param2", value="ABCDEFG")
		}
		)
public class FIlter2 extends HttpFilter implements Filter {
	private String param1;
	private String param2;
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public FIlter2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		request.setAttribute("param1", param1);
		request.setAttribute("param2", param2);
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		param1 = fConfig.getInitParameter("param1");
		param2 = fConfig.getInitParameter("param2");
	}

}
