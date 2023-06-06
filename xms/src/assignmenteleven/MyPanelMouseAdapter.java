package assignmenteleven;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MyPanelMouseAdapter extends MouseAdapter{
	
	JPanel mypanel;
	
	public MyPanelMouseAdapter(JPanel panel){
		this.mypanel = panel;
	}
	
	public void mouseClicked(MouseEvent e) {
		Graphics g = mypanel.getGraphics();
		g.drawRect(e.getX(), e.getY(), 20, 20);
	}
}