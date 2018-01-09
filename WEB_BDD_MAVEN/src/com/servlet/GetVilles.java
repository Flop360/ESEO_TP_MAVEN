package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.*;
import com.dao.VilleDAOImpl;

/**
 * Servlet implementation class GetVilles
 */
@WebServlet("/GetVilles")
public class GetVilles extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final String VUE = "/WEB-INF/ville.jsp";
	private static final String ATT_LIST_VILLE = "listVilles";

	VilleDAOImpl villeDAO = new VilleDAOImpl();
	List<Ville> villes = new ArrayList<Ville>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetVilles() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		villes = villeDAO.trouverVilles();
		request.setAttribute(ATT_LIST_VILLE, villes);
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
