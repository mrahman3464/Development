package org.mkseries.simpleservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Zoo
 */
//@WebServlet(name = "ZooInformation", description = "This Servlet provide zoo information", urlPatterns = { "/zooInformation" })
//@WebServlet(urlPatterns = { "/zoo" })
public class Zoo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Zoo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//PrintWriter out=response.getWriter();
		PrintWriter out=null;
//		out.println("<html>");
//		out.println("<body>");
		out.println("Zoo Jobs Portal: Please provide your Information");
		out.println("<form action=\"zoo\" method=\"POST\">");
		//out.println("<form action=\"http://localhost:8080/FirstServletProject/zoo\" method=\"POST\">");
		out.println("First Name: <input type= \"text\" name=\"first_name\">");
		out.println("<br/>");
		out.println("Last Name: <input type=\"text\" name=\"last_name\">");
		out.println(" <input type=\"submit\" value=\"Submit\">");
		out.println("</form>");
//		out.println("</body>");
//		out.println("</html>");
			
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//We write code to process the data which is sent by the client 
		String firstname=request.getParameter("first_name");
		String lastname=request.getParameter("last_name");
		
		
		PrintWriter out=response.getWriter();
		out.println("Hi"+firstname+" "+ ""+lastname +" Data has been saved or Processed");
		
	}
	
	
	
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		out.println("Update has been made");
		
	}
	
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		out.println("The Data got Deleted");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
