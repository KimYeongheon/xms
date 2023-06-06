package assignmenteleven;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	public MyPanel() {
		this.addMouseListener(new MyPanelMouseAdapter(this));
	}
}