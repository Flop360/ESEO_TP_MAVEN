package com;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdditionTest {

	@Test
	public void additionAvecDeuxNombres() {
		final long lAddition = Addition.calculer(10,20);
		Assert.assertEquals(30, lAddition);
		
	}
	
	@Before
	public void avant() {
		System.out.println("Avant");
	}
	@After
	public void apres() {
		System.out.println("Après");
	}

}
