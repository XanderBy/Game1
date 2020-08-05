package clases;

import java.awt.Graphics;
import java.util.ArrayList;

import enums.DificultadJuego;
import logica.PintarMapa;

public class Mapa {

	//Número de recuadros a lo Ancho
	private int Ancho;
	//Número de recuadros a lo Alto
	private int Alto;
	//Matriz con los objetos en el mapa
	private ObjetoMapa [][] Mapa;
	//Dificultad partida
	private DificultadJuego Dificultad;
	//Personaje/Jugador
	private Personaje Jugador;
	//Lista Enemigos
	private ArrayList<Enemigo> Enemigos=new ArrayList<Enemigo>();
	//Oleada Actual
	private int OleadaActual;
	//Tiempo jugado
	private Long TiempoJugado=(long) 0;
	//PuntuacionMaxima
	private Long PuntuacionMaxima=(long) 0;
	
	
	
	public Mapa(int ancho, int alto, ObjetoMapa[][] mapa, DificultadJuego dificultad, Personaje jugador,
			ArrayList<Enemigo> enemigos, Long tiempoJugado, Long puntuacionMaxima) {
		Ancho = ancho;
		Alto = alto;
		Mapa = mapa;
		Dificultad = dificultad;
		Jugador = jugador;
		Enemigos = enemigos;
		OleadaActual = 0;
		TiempoJugado = tiempoJugado;
		PuntuacionMaxima = puntuacionMaxima;
	}
	

	public Mapa(int ancho, int alto, ObjetoMapa[][] mapa) {
		super();
		Ancho = ancho;
		Alto = alto;
		Mapa = mapa;
	}


	public void Pintar(Graphics g) {
		PintarMapa.Pintar(g,this);
	}


	public int getAncho() {
		return Ancho;
	}



	public void setAncho(int ancho) {
		Ancho = ancho;
	}



	public int getAlto() {
		return Alto;
	}



	public void setAlto(int alto) {
		Alto = alto;
	}



	public ObjetoMapa[][] getMapa() {
		return Mapa;
	}



	public void setMapa(ObjetoMapa[][] mapa) {
		Mapa = mapa;
	}



	public DificultadJuego getDificultad() {
		return Dificultad;
	}



	public void setDificultad(DificultadJuego dificultad) {
		Dificultad = dificultad;
	}



	public Personaje getJugador() {
		return Jugador;
	}



	public void setJugador(Personaje jugador) {
		Jugador = jugador;
	}



	public ArrayList<Enemigo> getEnemigos() {
		return Enemigos;
	}



	public void setEnemigos(ArrayList<Enemigo> enemigos) {
		Enemigos = enemigos;
	}



	public int getOleadaActual() {
		return OleadaActual;
	}



	public void setOleadaActual(int oleadaActual) {
		OleadaActual = oleadaActual;
	}



	public Long getTiempoJugado() {
		return TiempoJugado;
	}



	public void setTiempoJugado(Long tiempoJugado) {
		TiempoJugado = tiempoJugado;
	}



	public Long getPuntuacionMaxima() {
		return PuntuacionMaxima;
	}



	public void setPuntuacionMaxima(Long puntuacionMaxima) {
		PuntuacionMaxima = puntuacionMaxima;
	}
	
	
	
	
	
	
	
}
