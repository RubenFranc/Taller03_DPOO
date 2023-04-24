package GUI;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class VentanaLightsOut extends JFrame{
	
	private PanelConfiguracion panelNorte;
	private PanelEstado panelSur;
	private PanelBotones panelEste;
	private LightsOutBoard panelCentro;

	public VentanaLightsOut() {
		
		Color color1 = new Color(52, 152, 219);
		Color color2 = new Color(242, 243, 244);
		
	    setTitle("Lights Out");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(560, 500);
	    
	    panelNorte = new PanelConfiguracion(new FlowLayout());
	    panelNorte.setBackground(color1);
	    panelNorte.setPreferredSize(new Dimension(500, 40));
	    panelNorte.addElementos();
	    
	    panelSur = new PanelEstado(new GridLayout());
	    panelSur.setBackground(color2);
	    panelSur.setPreferredSize(new Dimension(500, 40));
	    panelSur.addElementos();
	    
	    panelEste = new PanelBotones();
	    panelEste.setBackground(color2);
	    panelEste.setPreferredSize(new Dimension(140, 420));
	    panelEste.addElementos();
	    
	    
	    LightsOutBoard panelCentro = new LightsOutBoard(this);
	    panelCentro.setBackground(Color.BLUE);
	    
	    getContentPane().setLayout(new BorderLayout());
	    getContentPane().add(panelNorte, BorderLayout.NORTH);
	    getContentPane().add(panelSur, BorderLayout.SOUTH);
	    getContentPane().add(panelEste, BorderLayout.EAST);
	    getContentPane().add(panelCentro, BorderLayout.CENTER);
	    
	    setVisible(true);
	  }
	
	public PanelConfiguracion getPanelConfiguracion() {
		return this.panelNorte;
	}
	
	public LightsOutBoard getPanelTablero() {
		return this.panelCentro;
	}
	
	public void go() {
		
	}
	  
	public static void main(String[] args) {
	   new VentanaLightsOut();
	 }
	
}
