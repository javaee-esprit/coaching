package servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.AuthBean;


import domain.Admin;
import domain.Employee;
import domain.User;

import services.UserServiceLocal;

@WebServlet( urlPatterns = "/control" )
public class ControlServlet extends HttpServlet{
	
	@EJB
	private UserServiceLocal local;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		RequestDispatcher rd = null;
		AuthBean bean = new AuthBean(local, login, password);
		String navigateTo = bean.doLogin();
//		if ("javaee".equals(login)
//				&& "esprit".equals(password)) {
//			rd = getServletContext().getRequestDispatcher("/home.xhtml");
//		}else{
//			rd = getServletContext().getRequestDispatcher("/error.xhtml");
//		}
		rd = getServletContext().getRequestDispatcher(navigateTo);
		rd.forward(request, response);
		
	}

}
