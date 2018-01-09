package com.blo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.bean.CoordonneesGPS;
import com.bean.Ville;

import au.com.bytecode.opencsv.CSVReader;

public class VilleBLOImpl {
	private final static String RESOURCES_PATH = "src/main/resources/";
	private final static String VILLES_FILE_NAME = "laposte_hexasmal.csv";
	private final static char SEPARATOR = ';';

	public ArrayList<Ville> getVilles() {
		File file = new File(RESOURCES_PATH + VILLES_FILE_NAME);
		FileReader fr;
		CSVReader csvReader;
		ArrayList<String[]> data = new ArrayList<String[]>();
		String[] nextLine = null;
		try {
			fr = new FileReader(file);
			csvReader = new CSVReader(fr, SEPARATOR);

			while ((nextLine = csvReader.readNext()) != null) {
				int size = nextLine.length;

				// ligne vide
				if (size == 0) {
					continue;
				}
				String debut = nextLine[0].trim();
				if (debut.length() == 0 && size == 1) {
					continue;
				}

				// ligne de commentaire
				if (debut.startsWith("C")) {
					continue;
				}
				data.add(nextLine);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ArrayList<Ville> villes = new ArrayList<Ville>();
		for (String[] oneData : data) {
			String code_commune_INSEE = oneData[0];
			String nom_commune = oneData[1];
			String code_postal = oneData[2];
			String libelle_acheminement = oneData[3];
			String ligne_5 = oneData[4];
			String coordonnees_gps = oneData[5];
			String latitude=null;
			String longitude=null;
			if (coordonnees_gps.contains(", ")) {
				latitude = coordonnees_gps.split(", ")[0];
				longitude = coordonnees_gps.split(", ")[1];
			}
			CoordonneesGPS coord = new CoordonneesGPS(latitude, longitude);

			Ville ville = new Ville(code_commune_INSEE, nom_commune, libelle_acheminement, code_postal, ligne_5, coord);
			villes.add(ville);
		}
		return villes;

	}

}
