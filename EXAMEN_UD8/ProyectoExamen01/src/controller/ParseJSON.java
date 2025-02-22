package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.Casa;

public class ParseJSON {
		
	private static Gson g = new GsonBuilder().setPrettyPrinting().create();
	
	//LEER ARCHIVO DE TIPO CASAS
	public static List<Casa> leerCasa(String fileName) {
		
		List<Casa> casas = null;
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(fileName));
			casas = Arrays.asList(g.fromJson(bufferedReader, Casa[].class));
		}catch (FileNotFoundException e) { System.err.println(e.getMessage()); }
		finally {
			try { if (bufferedReader != null) bufferedReader.close();   }
			catch (IOException e) { System.err.println(e.getMessage()); }
		}	
		return casas;	
		

		}
}