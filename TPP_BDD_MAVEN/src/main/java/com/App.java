package com;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static final String FICHIER_PROPERTIES = "info.properties";
	private static final String PROPERTY_VERSION = "version";
	private static final String PROPERTY_PLATEFORME = "plateforme";
	
	
	
    public static void main( String[] args )
    {
    	Properties properties = new Properties();
        String version;
        String plateforme;
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream fichierProperties = classLoader.getResourceAsStream(FICHIER_PROPERTIES);
		try {
			properties.load(fichierProperties);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		version = properties.getProperty(PROPERTY_VERSION);
		plateforme = properties.getProperty(PROPERTY_PLATEFORME);
		
		System.out.println( "Hello World!" );
		System.out.println("\n-----------------------------------------------------");
		System.out.println("la version de l'application est : "+version);
		System.out.println("la platerforme de l'application est : "+plateforme);
	
		Connect.main();
        
    }
}
