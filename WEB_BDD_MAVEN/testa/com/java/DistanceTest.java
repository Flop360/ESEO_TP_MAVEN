package com.java;

import org.junit.Test;
import com.bean.*;
public class DistanceTest {
	
	@Test
	public void getDistanceTest() {
		CoordonneesGPS coordGPS1 = new CoordonneesGPS("48.4916267047", "3.93350100384");
		Ville ville1 = new Ville("10166","LES GRANDES CHAPELLES", "LES GRANDES CHAPELLES","10170","",coordGPS1);
		
		CoordonneesGPS coordGPS2 = new CoordonneesGPS("43.4833300","-1.4833300");
		Ville ville2 = new Ville("", "", "", "", "", coordGPS2);
		
		String distance = Distance.getDistance(ville1, ville2);
		System.out.println(distance);
		
		
		
	}
}
