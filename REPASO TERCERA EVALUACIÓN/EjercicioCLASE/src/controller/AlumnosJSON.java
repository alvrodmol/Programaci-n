package controller;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.*;

public class AlumnosJSON {

	static Gson g = new GsonBuilder().setPrettyPrinting().create();

	public static String printJson(String fileName, List<Alumno> lista) {
		return g.toJson(lista);
	}
}
