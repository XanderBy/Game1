package clases;

public abstract class Entidad {
	
	private int Ancho;
	private int Alto;
	private int X;
	private int Y;
	private Sprite Imagen;
	
	
	
	public Entidad(int ancho, int alto, int x, int y, Sprite imagen) {
		super();
		this.Ancho = ancho;
		this.Alto = alto;
		this.X = x;
		this.Y = y;
		this.Imagen = imagen;
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
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	public Sprite getImagen() {
		return Imagen;
	}
	public void setImagen(Sprite imagen) {
		this.Imagen = imagen;
	}
	
	
}
