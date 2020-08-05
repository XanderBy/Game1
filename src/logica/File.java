package logica;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class File {

	public static boolean EscribirEnFichero(Object objeto, String nombre) {
		try {
			FileOutputStream fileOut = new FileOutputStream("./src/objetos/"+nombre + ".lol");
			ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
			outStream.writeObject(objeto);
			outStream.close();
			fileOut.close();
		} catch (IOException i) {
			i.printStackTrace();
			return false;
		}
		return true;
	}

	public static Object CogerObjetoEnFichero(String nombre) {
		Object objeto = null;
		try {
			FileInputStream fileIn = new FileInputStream("./src/objetos/"+nombre + ".lol");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			objeto = (Object) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return null;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return null;
		}
		return objeto;
	}
}
