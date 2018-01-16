package com.java;

import static org.junit.Assert.*;

import org.junit.Test;
import com.bean.*;
public class DistanceTest {
	
	@Test
	public void getDistanceTest() {
		CoordonneesGPS coordGPS1 = new CoordonneesGPS("50.62925", "3.057256");
		Ville ville1 = new Ville("","Lille", "","","",coordGPS1);
		
		CoordonneesGPS coordGPS2 = new CoordonneesGPS("43.4833300","-1.4833300");
		Ville ville2 = new Ville("", "Bayonne", "", "", "", coordGPS2);
		
		String distance = Distance.getDistance(ville1, ville2);
		System.out.println(distance);
		
		assertEquals("Should be equals : ", "865.431",distance);
		
		
		
	}
}
