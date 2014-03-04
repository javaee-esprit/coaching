package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name =  "Hello Servlet", urlPatterns = "/welcome" , loadOnStartup = 1)
public class HelloServlet extends HttpServlet{
	
	private int visitCount = 0;
	
	public void init() throws ServletException {
		super.init();
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		super.service(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		visitCount++;
		String name = request.getParameter("name");
		PrintWriter out =  response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("hello response");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		for(int i=0; i<3; i++){
			out.println("<p>hello "+new StringBuilder(name).reverse().toString()+"!</p>");
		}
		out.println("<p><h2>visits : "+visitCount+"</h2></p>");
		out.println("</body>");
		out.println("</html>");
		
	}
	
	public void destroy() {
		super.destroy();
	}

}
