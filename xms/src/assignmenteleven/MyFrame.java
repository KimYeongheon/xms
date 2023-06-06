package assignmenteleven;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		this.setSize(400, 400);
		this.setTitle("RectangleMaker");
		MyPanel mypanel = new MyPanel();
		
		this.add(mypanel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}