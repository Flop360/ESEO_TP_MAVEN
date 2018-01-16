package com.java;


import com.bean.*;

public class Distance {

	public static String getDistance(Ville ville1, Ville ville2) {
		
		String latAold = ville1.getCoordonnees_gps().getLatitude();
		System.out.println(latAold);
		//String latANew = latAold.replace(".",",");
		//System.out.println(latANew);
		float latA = Float.valueOf(latAold);
		System.out.println(latA);
		float longA = Float.valueOf(ville1.getCoordonnees_gps().getLongitude());
		float latB = Float.valueOf(ville2.getCoordonnees_gps().getLatitude());
		float longB = Float.valueOf(ville2.getCoordonnees_gps().getLongitude());
		
		int rayon = 6371;
		
		
		int radlatA = (int) ((latA*Math.PI)/180);
		int radlongA = (int) ((longA*Math.PI)/180);
		
		int radlatB = (int) ((latB*Math.PI)/180);
		int radlongB = (int) ((longB*Math.PI)/180);
		
		int distance = (int) (rayon * Math.acos(Math.sin(radlatA)*Math.sin(radlatB) 
				+ Math.cos(radlatA)*Math.cos(radlatB)*Math.cos(radlongA-radlongB)));
		String distanceValue = String.valueOf(distance);
		
		return distanceValue;
		
		
	}
}
