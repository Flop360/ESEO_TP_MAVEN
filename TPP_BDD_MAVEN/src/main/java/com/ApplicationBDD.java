package com;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import com.bean.*;
import com.blo.VilleBLOImpl;
import com.controller.VilleController;
import com.dao.VilleDAOImpl;

public class ApplicationBDD {
	
	private static final String FICHIER_CSV = "laposte_hexasmal.csv";
	private static final String FICHIER_INFOS_PROPERTIES = "info.properties";
	private static final String PROPERTY_VERSION = "version";
	private static final String PROPERTY_PLATEFORME = "plateforme";
	
	public static void main( String[] args )
    {
    	Properties properties = new Properties();
    	Properties properties1 =new Properties();
        String version;
        String plateforme;
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream fichierInfoProperties = classLoader.getResourceAsStream(FICHIER_INFOS_PROPERTIES);
		InputStream fichierCSV = classLoader.getResourceAsStream(FICHIER_CSV);
		
		
		try {
			properties.load(fichierInfoProperties);
			properties1.load(fichierCSV);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		version = properties.getProperty(PROPERTY_VERSION);
		plateforme = properties.getProperty(PROPERTY_PLATEFORME);
		
		
		
		ArrayList<Ville> listVilles = new ArrayList<Ville>();
		ArrayList<Ville> listVillesDao = new ArrayList<Ville>();
		
		
		VilleBLOImpl villeBloImpl = new VilleBLOImpl();
		VilleDAOImpl villeDaoImpl = new VilleDAOImpl();
		
		VilleController vc = new VilleController();
		
		listVilles = villeBloImpl.getVilles();
		
		listVillesDao = villeDaoImpl.trouverVilles();
		
		vc.synchroniseVilles(listVilles, listVillesDao);
		
		
		
		String nom_commune;
		String code_postal;
		String code_commune;
		String ligne5;
		String libelle;
		String latitude;
		String longitude;
		
		System.out.println( "Hello World!" );
		System.out.println("\n-----------------------------------------------------");
		System.out.println("la version de l'application est : "+version);
		System.out.println("la platerforme de l'application est : "+plateforme);
		System.out.println("Voici le résultat du fichier CSV. Suite à ce fichiers, la base de données est en cours de mise à jour !");
		for (Ville ville : listVilles) {
			code_commune = ville.getCode_commune_INSEE();
			code_postal = ville.getCode_postal();
			libelle = ville.getLibelle_acheminement();
			ligne5 = ville.getLigne_5();
			nom_commune = ville.getNom_commune();
			latitude = ville.getCoordonnees_gps().getLatitude();
			longitude = ville.getCoordonnees_gps().getLongitude();
			
			System.out.println(" Code Commune : "+code_commune+ " ; Nom Commune : "+nom_commune+" ; Code Postal : "
					+code_postal+" ; Libellé : "+libelle+" ; Ligne 5 : "+ligne5+" ; Latitude : "+latitude+" ; Longitude : "
					+longitude);
			
		}
		
		
		
		
		
	
		Connect.main();
        
    }
	
}