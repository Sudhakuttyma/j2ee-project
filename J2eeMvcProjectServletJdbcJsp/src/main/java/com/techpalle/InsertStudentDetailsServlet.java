package com.techpalle;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techpalle.dao.DataAccess;

/**
 * Servlet implementation class InsertStudentDetailsServlet
 */
@WebServlet("/insertstudent")
public class InsertStudentDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertStudentDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name=request.getParameter("name");
		String course=request.getParameter("course");
		String gender=request.getParameter("male");
		String email=request.getParameter("email");
		String education=request.getParameter("education");
		
		//PrintWriter out=response.getWriter();
		//out.println("name is : "+name);
		//out.println("course is : "+course);
		DataAccess.insertStudent(name, course,gender,email,education);
		
	}

}
