package logica;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public abstract class Propiedades {
	

	public static String GetProperty(String propiedad) {
		Properties properties=new Properties();
		String Valor="";
		try {
			properties.load(LoadGetProperties());
			Valor=properties.getProperty(propiedad);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al coger un propiedad");
		}
		
		return Valor;
	}
	public static boolean SetProperty(String propiedad, String valor) {
		Properties properties=new Properties();
		try {
			properties.setProperty(propiedad, valor);
			properties.store(LoadSetProperties(), null);
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al modificar una propiedad");
			return false;
		}
		
	}
	public static OutputStream LoadSetProperties() {
		OutputStream output=null;
		try {
			output = new FileOutputStream("./src/recursos/config.properties");
		} catch (FileNotFoundException e) {
			
			System.out.println("Error al cargar el archivo properties Set");
		}
		return output;
	}
	public static InputStream  LoadGetProperties() {
		InputStream  input=null;
		try {
			input = new FileInputStream("./src/recursos/config.properties");
		} catch (FileNotFoundException e) {
			
			System.out.println("Error al cargar el archivo properties Get");
		}
		return input;
	}
	
}
