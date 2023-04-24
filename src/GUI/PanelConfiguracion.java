package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class PanelConfiguracion extends JPanel{
	
	ButtonGroup buttonGroup;
	JComboBox<String> comboBox;

	public PanelConfiguracion(FlowLayout flowLayout) {
		// TODO Auto-generated constructor stub
	}
	
	public void addElementos() {
		
		Color color = new Color(253, 254, 254);
		
		JLabel label = new JLabel("Tamaño:");
		label.setForeground(color);
		this.add(label);
		
		comboBox = new JComboBox<>();
		comboBox.setPreferredSize(new Dimension(90,20));
		comboBox.addItem("4x4");
		comboBox.addItem("5x5");
		comboBox.addItem("6x6");
		this.add(comboBox);

		JLabel label1 = new JLabel("Dificultad:");
		label1.setForeground(color);
		this.add(label1);
		
		buttonGroup = new ButtonGroup();
		JRadioButton radioButton1 = new JRadioButton("Fácil");
		radioButton1.setForeground(color);
		radioButton1.setOpaque(false);
		JRadioButton radioButton2 = new JRadioButton("Medio");
		radioButton2.setForeground(color);
		radioButton2.setOpaque(false);
		JRadioButton radioButton3 = new JRadioButton("Difícil");
		radioButton3.setForeground(color);
		radioButton3.setOpaque(false);
		buttonGroup.add(radioButton1);
		buttonGroup.add(radioButton2);
		buttonGroup.add(radioButton3);
		this.add(radioButton1);
		this.add(radioButton2);
		this.add(radioButton3);
	}
	
	public String getTamanio(){
		return (String) this.comboBox.getSelectedItem();
	}
	
	public String getDificultad() {
		try {
			JButton selectedButton = (JButton) this.buttonGroup.getSelection();
			String selectedButtonText = selectedButton.getText();
			return selectedButtonText;
		}
		catch (NullPointerException as) {
			return "Medio";
		}
		
		
	}
	
}
