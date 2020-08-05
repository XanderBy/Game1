package logica;

import clases.FPScounter;
import clases.Juego;
import clases.Mapa;
import clases.Menu;
import clases.ObjetoMapa;
import clases.Pantalla;
import clases.Sprite;
import enums.Entorno;
import enums.TipoObjetoMapa;

public class VentanaBasica {
	
	private static Sprite sprite=new Sprite("D:\\Proyectos\\JuegoEnemigosPorOleadas\\src\\sprites\\dirt1.jpg");
	public static ObjetoMapa OM=new ObjetoMapa(32,32,100,100,sprite,TipoObjetoMapa.Suelo);
	private static ObjetoMapa[][] matriz= {{OM}};

	public static Menu menu=null;
	public static Juego juego=null;
	public static Mapa mapaElegido=new Mapa(10,10,matriz);
	
	public static Boolean IniciarVentana(Pantalla pantalla) {
		try {
			pantalla.setVisible(true);
			Thread hiloDePantalla=new Thread(pantalla);
			pantalla.setHiloPantalla(hiloDePantalla);
			pantalla.getHiloPantalla().start();
			System.out.println("Pantalla Iniciada");
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	public static Boolean PararVentana(Pantalla pantalla) {
		try {
			pantalla.getHiloPantalla().interrupted();
			pantalla.getVentana().setVisible(false);
			System.out.println("Pantalla Parada");
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	public static void Pintar(Entorno entorno,Pantalla pantalla) {
		switch (entorno) {
		case Juego:
			if (juego == null) {
				System.out.println("Entorno Elegido Juego");
				juego=new Juego(pantalla,mapaElegido);
				juego.setVisible(true);
			}
			break;
		case Menu:
			if (menu == null) {
				System.out.println("Entorno Elegido Menu");
				menu=new Menu(pantalla);
			}
			menu.paint(pantalla.getGraphics());
			break;

		default:
			System.out.println("Error al elegir el entorno");
			break;
		}

	}
}
