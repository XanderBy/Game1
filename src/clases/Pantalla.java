package clases;

import java.awt.BorderLayout;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import enums.Entorno;
import logica.VentanaBasica;

public class Pantalla extends JFrame implements Runnable {

	/*
	 * 
	 * Propiedades
	 * 
	 */
	private String NombreVentana;
	private ImageIcon IconoVentana;
	private int Ancho;
	private int Alto;
	private JPanel  Ventana;
	private Entorno Entorno;
	private Thread HiloPantalla;
	
	
	/*
	 * 
	 * Constructores
	 * 
	 */
	public Pantalla(String NombreVentana, String PathIconoVentana,int Ancho, int Alto) {
		
		this.IconoVentana=new ImageIcon(PathIconoVentana);
		this.NombreVentana=NombreVentana;
		this.Entorno=Entorno.Juego;
		this.Ancho = Ancho;
		this.Alto = Alto;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, this.getAncho(), this.getAlto());
        Ventana = new JPanel();
        Ventana.setBorder(new EmptyBorder(5, 5, 5, 5));
        Ventana.setLayout(new BorderLayout(0, 0));
        setContentPane(Ventana);
        setBounds(0,0,this.Ancho, this.getAlto());
		VentanaBasica.IniciarVentana(this);
	}
	
	/*
	 * 
	 * Metodos
	 * 
	 */
	@Override
	public void run() {
		while(true) {
			FPScounter.StartCounter();  ;
			paint(getGraphics());
			FPScounter.StopAndPost();
		}
		
		
		
	}
	@Override
	public void paint(Graphics g)
    {
		VentanaBasica.Pintar(this.getEntorno(),this);
    }
	
	public void updates() {
		
	}
	
	/*
	 * 
	 * Getters/Setters
	 * 
	 */
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
	public JPanel getVentana() {
		return Ventana;
	}
	public void setVentana(JPanel ventana) {
		this.Ventana = ventana;
	}
	public Entorno getEntorno() {
		return Entorno;
	}
	public void setEntorno(Entorno entorno) {
		this.Entorno = entorno;
	}
	public Thread getHiloPantalla() {
		return HiloPantalla;
	}
	public void setHiloPantalla(Thread hiloPantalla) {
		this.HiloPantalla = hiloPantalla;
	}


	
	
}
