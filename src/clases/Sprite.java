package clases;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Sprite {

	private int Ancho;
	private int Alto;
	private ImageIcon ImageI;
	private Image ImageDraw;
	
	
	public Sprite(String pathImage) {
		this.ImageI=new ImageIcon(pathImage);
		this.ImageDraw=this.ImageI.getImage();
		this.Ancho = this.getImageDraw().getWidth(null);
		this.Alto = this.getImageDraw().getHeight(null);
		
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
	public ImageIcon getImageI() {
		return ImageI;
	}
	public void setImageI(ImageIcon imageI) {
		ImageI = imageI;
	}
	public Image getImageDraw() {
		return ImageDraw;
	}
	public void setImageDraw(Image imageDraw) {
		ImageDraw = imageDraw;
	}
	
	
	
}
