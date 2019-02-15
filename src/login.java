

import java.io.BufferedReader; // Buffered reader
import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
@MultipartConfig(location="/tmp", fileSizeThreshold=1024*1024, 
maxFileSize=1024*1024*5, maxRequestSize=1024*1024*5*5)
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/login.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//BufferedReader reader = request.getReader(); // directly referencing request reader
		String line;
		//Collection<Part> multiData = request.getParts();
		System.out.println(request.getPart("username"));
//		for (Part part : multiData) {
//			System.out.println(part.getName());
//		}
		
//		while ((line = reader.readLine()) != null) {
//			System.out.println(line);
//		}
		//response.getWriter().append("Hello: " + request.getPart("username"));
		response.setContentType("text/plain");
		
	}

}