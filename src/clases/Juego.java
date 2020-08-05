package clases;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import logica.VentanaBasica;

public class Juego extends Canvas implements KeyListener  {

	
	private Pantalla pantalla;
	private Mapa mapa;
	
	private Image dibujoAux;
	private Graphics gAux;
	private Dimension dimAux;
	private Dimension dimCanvas;
	
	
	public Juego(Pantalla pantalla,Mapa mapa) {
		super();
		this.pantalla = pantalla;
		this.mapa=mapa;
		this.setVisible(true);
		this.pantalla.add(this);
		this.setSize(new Dimension(pantalla.getAncho(),pantalla.getAlto()));
		this.dimCanvas=this.getSize();
		this.addKeyListener(this);
	}
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	
	@Override
	public void paint (Graphics g)
    {
		
		if(gAux==null || dimAux==null|| dimCanvas.width !=dimAux.width|| dimCanvas.height !=dimAux.height) {
			dimAux=dimCanvas;
			dibujoAux=createImage(dimAux.width,dimAux.height);
			gAux=dibujoAux.getGraphics();
		}
		
		this.mapa.Pintar(gAux);
		
		g.drawImage(dibujoAux,0,0,this);
		gAux.clearRect(0, 0, this.pantalla.getAncho(), this.pantalla.getAlto());
		
    }
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		if(e.getKeyCode()==65) {
			this.mapa.getMapa()[0][0].setX(this.mapa.getMapa()[0][0].getX()-5);
			update(getGraphics());
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

}
