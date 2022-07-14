/* Copyright (c) 2020, Oracle and/or its affiliates. All rights reserved.*/
package ctbarbanza.com.jdbc.example01;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import ctbarbanza.com.jdbc.example01.model.*;

 
public class App_ejemplo_csv {
	private static final JsonElement Object = null;

	public static void main(String[] args) throws JsonProcessingException {
		System.out.println(".. start");
		
		// Transformador Complejo - Patrón Builder
		GsonBuilder builder = new GsonBuilder();
		builder.excludeFieldsWithoutExposeAnnotation();
		Gson gsonExpose = builder.create();
		
		// Transformador Simple - Todo para adelante
		Gson gsonSinExpose = new Gson();
		
		// Objeto de transformación
		Coche cocheOriginal = new Coche();
		
		// Objecto POJO(Java) -> JSON
		String json1 = gsonSinExpose.toJson(cocheOriginal);
		String json2 = gsonExpose.toJson(cocheOriginal);
		
		
		// EJEMPLO DE CSV
		CsvMapper mapper = new CsvMapper();
 
		CsvSchema schema = mapper.schemaFor(Coche.class); // schema from 'Pojo' definition
		String csv = mapper.writer(schema).writeValueAsString(cocheOriginal);
		 
		
		

		System.out.println(".. done");

	}
}
