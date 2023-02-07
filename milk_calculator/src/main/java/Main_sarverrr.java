

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Main_sarverrr
 */
public class Main_sarverrr extends HttpServlet   {
	private static final long serialVersionUID = 1L;
       
    /**
     * @throws IOException 
     * @see HttpServlet#HttpServlet()
     */
    public void service(HttpServletRequest request ,HttpServletResponse responce) throws IOException {
       // super();
    	
    	PrintWriter out = responce.getWriter();
    	out.println("hi surya");

	}

}
