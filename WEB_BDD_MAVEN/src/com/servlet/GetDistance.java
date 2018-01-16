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

import com.bean.CoordonneesGPS;
import com.bean.Ville;
import com.java.Distance;

/**
 * Servlet implementation class GetDistance
 */
@WebServlet("/GetDistance")
public class GetDistance extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VUE = "/WEB-INF/distance.jsp";


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetDistance() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Map params = request.getParameterMap();

		Iterator i = params.keySet().iterator();
		List<Ville> villes = new ArrayList<Ville>();
		i.next();
		while (i.hasNext())

		{
			CoordonneesGPS coGPS = new CoordonneesGPS();
			Ville ville = new Ville();
			String key = (String) i.next();
			coGPS.setLatitude(request.getParameter(key).substring(0, request.getParameter(key).indexOf("-")));
			coGPS.setLongitude(request.getParameter(key).substring(request.getParameter(key).indexOf("-"),
					request.getParameter(key).length()));
			ville.setCoordonnees_gps(coGPS);
			villes.add(ville);
		}
		request.setAttribute("distance", Distance.getDistance(villes.get(0), villes.get(1)));
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);

	}

}
