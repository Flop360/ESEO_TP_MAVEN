package com.java;


import com.bean.*;

public class Distance {

	public static String getDistance(Ville ville1, Ville ville2) {
		
		String latAold = ville1.getCoordonnees_gps().getLatitude();
		float latA = Float.valueOf(latAold);
		float longA = Float.valueOf(ville1.getCoordonnees_gps().getLongitude());
		float latB = Float.valueOf(ville2.getCoordonnees_gps().getLatitude());
		float longB = Float.valueOf(ville2.getCoordonnees_gps().getLongitude());
		
		int rayon = 6371;
		
		
		float radlatA = (float) ((latA*Math.PI)/180);
		float radlongA = (float) ((longA*Math.PI)/180);
		
		float radlatB = (float) ((latB*Math.PI)/180);
		float radlongB = (float) ((longB*Math.PI)/180);
		
		float distance = (float) (rayon * Math.acos(Math.sin(radlatA)*Math.sin(radlatB) 
				+ Math.cos(radlatA)*Math.cos(radlatB)*Math.cos(radlongA-radlongB)));
		
		String distanceValue = String.valueOf(distance);
		
		return distanceValue;
		
		
	}
}
