package clases;


import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener{
	
	private Pantalla pantalla;
	
	public Menu(Pantalla pantalla) {
		this.pantalla=pantalla;
	}
	
	public void paint (Graphics g)
    {
		//System.out.println("LLega");
		//this.pantalla.paint(g);
		//g.drawString(String.valueOf(fps), 50, 50);
		
		
       //g.drawRect (10, 10, 50, 50);
		//this.pantalla.repaint();
		//g.clearRect(0, 0, this.pantalla.getAncho(), this.pantalla.getAlto());
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
