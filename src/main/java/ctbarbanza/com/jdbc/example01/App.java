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

 
public class App {
	private static final JsonElement Object = null;

	public static void main(String[] args) {
		System.out.println(".. start");
		
		GsonBuilder builder = new GsonBuilder();
		builder.excludeFieldsWithoutExposeAnnotation();
		Gson gsonExpose = builder.create();
		Gson gsonSinExpose = new Gson();
		
		String json = gsonSinExpose.toJson(Object);
		
		
		// Ejemplos de transformación Json
		int one = gsonSinExpose.fromJson("1", int.class);
		Integer onei = gsonSinExpose.fromJson("1", Integer.class);
		Long onel = gsonSinExpose.fromJson("1", Long.class);
		Boolean bool = gsonSinExpose.fromJson("false", Boolean.class);
		String str = gsonSinExpose.fromJson("\"abc\"", String.class);
		String anotherStr = gsonSinExpose.fromJson("[\"abc\"]", String.class);
		
		

		System.out.println(".. done");

	}
}
