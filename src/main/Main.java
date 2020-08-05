package main;

import clases.Pantalla;
import logica.Propiedades;

public class Main {
	public static Pantalla pantalla;
	public static void main(String[] args) {
		
		System.out.println(Propiedades.SetProperty("hola","valores"));
		System.out.println(Propiedades.GetProperty("hola"));
		pantalla=new Pantalla("Prueba", "", 300, 300);

	}

}
