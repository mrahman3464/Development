package org.mkseries.simpleservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Verification
 */
@WebFilter("/zoo")
public class Verification implements Filter {

    /**
     * Default constructor. 
     */
    public Verification() {
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
		//if today is sunday then print website is closed else...
		PrintWriter out =response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Executing before invoking servlet method");
		
		chain.doFilter(request, response);
		
		out.println("Executing After invoking servlet method");
		
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
