package logica;

import java.awt.Graphics;
import java.awt.Graphics2D;

import clases.Mapa;
import clases.Pantalla;

public class PintarMapa {

	public static void Pintar(Graphics g, Mapa mapa) {
		
		//for(int x=0; x<1;x++) {
			//for (int y = 0; y < 1; y++) {
				//mapa.getMapa()[x][y].Pintar(g,pantalla);
				Graphics2D g2= (Graphics2D) g;
				//System.out.println(mapa.getMapa()[0][0].getX() + " Verdad");
				//mapa.getMapa()[0][0].setX(mapa.getMapa()[0][0].getX()-5);
				g2.drawImage(mapa.getMapa()[0][0].getImagen().getImageDraw(),mapa.getMapa()[0][0].getX() , mapa.getMapa()[0][0].getY(), null);
			//}
		//}
		
	}
	
}
