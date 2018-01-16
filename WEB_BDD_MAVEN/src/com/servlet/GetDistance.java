package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Ville;

/**
 * Servlet implementation class GetDistance
 */
@WebServlet("/GetDistance")
public class GetDistance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetDistance() {
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
	    Map params = request.getParameterMap();

	    Iterator i = params.keySet().iterator();
	   
	    List<Ville> villes = new ArrayList<Ville>();

	    while ( i.hasNext() )

	      {
	    	 Ville ville = new Ville();

	        String key = (String) i.next();
	        System.out.println(key);

//	        Ville value = (Ville) params.get( key ))[ 0 ];
//	        villes.add(value);
//	        System.out.println(value.toString());

	      }
	    }

}
