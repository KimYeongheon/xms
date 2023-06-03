package assignmentten;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PizzaMenu extends JFrame {
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	public PizzaMenu() {
		super("MyFrame");
		setSize(650, 150);
		p2.add(new JLabel("Welcome to Java pizza. Choose the type of pizza"));
		p1.add(new JButton("Combination Pizza"));
		p1.add(new JButton("Potato pizza"));
		p1.add(new JButton("Roasted meat pizza"));
		p1.add(new JLabel("count"));
		p1.add(new JTextField(12));
		Container cp = getContentPane();
		cp.add(p2, BorderLayout.NORTH);
		cp.add(p1, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}