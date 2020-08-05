package clases;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.ImageObserver;

import enums.TipoObjetoMapa;

public class ObjetoMapa extends Entidad {

	private TipoObjetoMapa TipoObjeto;
	
	
	public ObjetoMapa(int ancho, int alto, int x, int y, Sprite imagen, TipoObjetoMapa TipoObjeto) {
		super(ancho, alto, x, y, imagen);
		this.TipoObjeto=TipoObjeto;
	}

	public void Pintar(Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		
		g2.drawImage(this.getImagen().getImageDraw(), this.getX(), this.getY(), null);
		
	}
	
	public TipoObjetoMapa getTipoObjeto() {
		return TipoObjeto;
	}
	public void setTipoObjeto(TipoObjetoMapa tipoObjeto) {
		TipoObjeto = tipoObjeto;
	}
	
	
	
}
