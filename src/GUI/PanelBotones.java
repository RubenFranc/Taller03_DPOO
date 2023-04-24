package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.*;

public class PanelBotones extends JPanel{
	
	public void addElementos() {
			
			Color color = new Color(52, 152, 219);
			Color color1 = new Color(253, 254, 254);

			JButton button1 = new JButton("NUEVO");
			button1.setBackground(color);
			button1.setForeground(color1);
			button1.setPreferredSize(new Dimension(135,20));
			JButton button2 = new JButton("REINICIAR");
			button2.setBackground(color);
			button2.setForeground(color1);
			button2.setPreferredSize(new Dimension(135,20));
			JButton button3 = new JButton("TOP-10");
			button3.setBackground(color);
			button3.setForeground(color1);
			button3.setPreferredSize(new Dimension(135,20));
			JButton button4 = new JButton("CAMBIAR JUGADOR");
			button4.setBackground(color);
			button4.setForeground(color1);

			button1.setAlignmentX(Component.CENTER_ALIGNMENT);
			button1.setAlignmentY(Component.CENTER_ALIGNMENT);
			button2.setAlignmentX(Component.CENTER_ALIGNMENT);
			button2.setAlignmentY(Component.CENTER_ALIGNMENT);
			button3.setAlignmentX(Component.CENTER_ALIGNMENT);
			button3.setAlignmentY(Component.CENTER_ALIGNMENT);
			button4.setAlignmentX(Component.CENTER_ALIGNMENT);
			button4.setAlignmentY(Component.CENTER_ALIGNMENT);

			this.add(button1);
			this.add(button2);
			this.add(button3);
			this.add(button4);
			
		}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
		
		
//	}

}
