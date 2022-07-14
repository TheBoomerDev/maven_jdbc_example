package ctbarbanza.com.jdbc.example01.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Coche {
	
	@Expose()
	@SerializedName("numero_ruedas")
	private int ruedas = 4;
	
	@Expose()
	@SerializedName("marca")
	private String marca = "Seat";
	
	@Expose()
	@SerializedName("marca_modelo")
	private String modelo = "Ibiza";
	
	@Expose() 
	private int year = 1983;
	
	@Expose()
	@SerializedName("fue_vendido")
	private boolean vendido = true;
	
	private int precio = 15000;

}
