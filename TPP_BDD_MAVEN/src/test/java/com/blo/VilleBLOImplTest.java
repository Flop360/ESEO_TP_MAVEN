package com.blo;

import static org.junit.Assert.*;

import org.junit.Test;

public class VilleBLOImplTest {

	@Test
	public void testGetVilles() {
		VilleBLOImpl vBLO = new VilleBLOImpl();
		vBLO.getVilles();
		assertEquals(vBLO.getVilles().size(), 39201);
	}

}
