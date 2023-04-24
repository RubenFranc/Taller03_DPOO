package GUI;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

public class PanelEstado extends JPanel{
	
	public PanelEstado(GridLayout gridLayout) {
		// TODO Auto-generated constructor stub
	}
	
	public void addElementos() {
		JLabel label = new JLabel("Jugadas:");
		label.setPreferredSize(new Dimension(105, 20));
		this.add(label);
		
		JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(105, 20));
		this.add(textField);
		
		JLabel label1 = new JLabel("Jugador:");
		label1.setPreferredSize(new Dimension(105, 20));
		this.add(label1);
		
		JTextField textField1 = new JTextField();
		textField1.setPreferredSize(new Dimension(105, 20));
		this.add(textField1);
	}

}
