/* Copyright (c) 2020, Oracle and/or its affiliates. All rights reserved.*/
package ctbarbanza.com.jdbc.example01;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import ctbarbanza.com.jdbc.example01.model.*;

 
public class App_ejemplo_gson {
	private static final JsonElement Object = null;

	public static void main(String[] args) {
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
		
		// JSON -> Objecto POJO(Java)
		Coche coche2 = gsonSinExpose.fromJson(json1, Coche.class);
		Coche coche1 = gsonExpose.fromJson(json2, Coche.class);
		
		 
		// Ejemplos de transformación Json
		int one = gsonSinExpose.fromJson("1", int.class);
		Integer onei = gsonSinExpose.fromJson("1", Integer.class);
		Long onel = gsonSinExpose.fromJson("1", Long.class);
		Boolean bool = gsonSinExpose.fromJson("false", Boolean.class);
		String str = gsonSinExpose.fromJson("\"abc\"", String.class);
		
		

		System.out.println(".. done");

	}
}
