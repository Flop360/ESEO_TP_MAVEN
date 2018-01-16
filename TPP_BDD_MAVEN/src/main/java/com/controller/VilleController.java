package com.controller;

import com.blo.VilleBLO;
import com.dao.VilleDAO;

import java.util.ArrayList;

import com.bean.Ville;

public class VilleController {

	VilleBLO villesBLO;
	VilleDAO villesDAO;
	
	public ArrayList<Ville> synchroniseVilles(ArrayList<Ville> listVilleBlo, ArrayList<Ville> listVilleDao){
		
		
		listVilleBlo = villesBLO.getVilles();
		listVilleDao = villesDAO.trouverVilles();
		
		listVilleBlo.removeAll(listVilleDao);
		
		villesDAO.ajouterVilles(listVilleBlo);
		
		return listVilleBlo;
		
		
	}
	
	public void synchroniseVilles() {
		ArrayList<Ville> listVilleBlo = new ArrayList<Ville>();
		ArrayList<Ville> listVilleDao = new ArrayList<Ville>();
		
		listVilleBlo = villesBLO.getVilles();
		listVilleDao = villesDAO.trouverVilles();
		
		listVilleBlo.removeAll(listVilleDao);
		
		villesDAO.ajouterVilles(listVilleBlo);
				
	}
	

}
	