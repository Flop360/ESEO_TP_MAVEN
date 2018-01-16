package com.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.bean.CoordonneesGPS;
import com.bean.Ville;
import com.blo.VilleBLOImpl;



public class TestVilleDAOImpl {

	VilleDAOImpl villeDaoImpl = new VilleDAOImpl();
	VilleBLOImpl villeBloImpl = new VilleBLOImpl() ;
	
	
	@Test
	public void UC01_trouverVillesTest() {
		String code_commune_INSEE = "10227";
		
		ArrayList<Ville> listVille = villeDaoImpl.trouverVilles();
		
		assertEquals("Sont egaux : ",code_commune_INSEE, listVille.get(0).getCode_commune_INSEE());
		assertEquals(39201,listVille.size());
	}
	
	@Test
	public void UC02_trouverVilleByCode() {
		String code_commune_INSEE = "10227";
		ArrayList<Ville> listVille = villeDaoImpl.trouverVilles(code_commune_INSEE);
		
		assertEquals(listVille.size(),1);
	}

	@Test
	public void UC03_ajouterVilleTest() {
		ArrayList<Ville> listVilleAAjouter = new ArrayList<Ville>();
		String code_commune_INSEE = "49630";
		String nom_commune = "MAZÉ-MILON";
		String code_postal= "49630";
		String libelle = "MAZE-MILON";
		String ligne5 = "MAZE City";
		String latitude = "49.14821";
		String longitude = "3.14";
		Ville ville = new Ville();
		CoordonneesGPS coordonnees_gps = new CoordonneesGPS(latitude, longitude);
		ville.setCode_commune_INSEE(code_commune_INSEE);
		ville.setNom_commune(nom_commune);
		ville.setCode_postal(code_postal);
		ville.setLibelle_acheminement(libelle);
		ville.setLigne_5(ligne5);
		ville.setCoordonnees_gps(coordonnees_gps);
		listVilleAAjouter.add(ville);
		
		villeDaoImpl.ajouterVilles(listVilleAAjouter);
		ArrayList<Ville> listVille = villeDaoImpl.trouverVilles();
		
		assertEquals(listVille.size(),39202);
		
		villeDaoImpl.supprimerVilles(listVilleAAjouter);
	}
	
	
	@Test
	public void UC04_majVillesTest() {
		ArrayList<Ville> listVilleAMaj = new ArrayList<Ville>();
		ArrayList<Ville> listVilleATrouver = new ArrayList<Ville>();
		String code_commune_INSEE = "49630";
		String nom_commune = "MAZÉ-MILON";
		String code_postal= "49630";
		String libelle = "MAZE-MILON";
		String ligne5 = "MAZE-MILON City";
		String latitude = "49.14821";
		String longitude = "3.14";
		Ville ville = new Ville();
		CoordonneesGPS coordonnees_gps = new CoordonneesGPS(latitude, longitude);
		ville.setCode_commune_INSEE(code_commune_INSEE);
		ville.setNom_commune(nom_commune);
		ville.setCode_postal(code_postal);
		ville.setLibelle_acheminement(libelle);
		ville.setLigne_5(ligne5);
		ville.setCoordonnees_gps(coordonnees_gps);
		listVilleAMaj.add(ville);
		
		villeDaoImpl.majVilles(listVilleAMaj);
		
		listVilleATrouver = villeDaoImpl.trouverVilles(code_commune_INSEE);
		
		assertEquals(listVilleATrouver.get(0).getLigne_5(),ligne5);
		
	}
	
	@Test
	public void UC05_supprimerVillesTest() {
		ArrayList<Ville> listVilleAAjouter = new ArrayList<Ville>();
		String code_commune_INSEE = "49630";
		String nom_commune = "MAZÉ-MILON";
		String code_postal= "49630";
		String libelle = "MAZE-MILON";
		String ligne5 = "MAZE City";
		String latitude = "49.14821";
		String longitude = "3.14";
		Ville ville = new Ville();
		CoordonneesGPS coordonnees_gps = new CoordonneesGPS(latitude, longitude);
		ville.setCode_commune_INSEE(code_commune_INSEE);
		ville.setNom_commune(nom_commune);
		ville.setCode_postal(code_postal);
		ville.setLibelle_acheminement(libelle);
		ville.setLigne_5(ligne5);
		ville.setCoordonnees_gps(coordonnees_gps);
		listVilleAAjouter.add(ville);
		
		villeDaoImpl.ajouterVilles(listVilleAAjouter);
		ArrayList<Ville> listVille = villeDaoImpl.trouverVilles();
		
		assertEquals(listVille.size(),39202);
		
		villeDaoImpl.supprimerVilles(listVilleAAjouter);
		
		assertEquals(listVille.size(),39201);
	}
}
