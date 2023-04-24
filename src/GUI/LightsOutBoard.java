package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import uniandes.dpoo.taller4.modelo.Tablero;

public class LightsOutBoard extends JPanel {

//    private int[][] board;
    private int rows = 5, cols = 5;
    private int dificultad;
    private Tablero tablero;
    private int cellSize;

    public LightsOutBoard(VentanaLightsOut ventana) {
        
        PanelConfiguracion configuraciones = ventana.getPanelConfiguracion();
		String selectedSize = configuraciones.getTamanio();
		this.rows = Integer.parseInt(selectedSize.substring(0, 1));
		this.cols = Integer.parseInt(selectedSize.substring(0, 1));
		this.cellSize = 300/rows;
		String selectedDificulty = configuraciones.getDificultad();
		if (selectedDificulty.equals("Fácil")) {
			this.dificultad = 4;
		}
		else if (selectedDificulty.equals("Medio")) {
			this.dificultad = 7;
		}
		else if (selectedDificulty.equals("Difícil")) {
			this.dificultad = 10;
		}
		else {
			this.dificultad = 7;
		}
		
		this.tablero = new Tablero(rows);
		tablero.desordenar(dificultad);
        
//        board = new int[rows][cols];
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = e.getY() / cellSize;
                int col = e.getX() / cellSize;
                tablero.jugar(row, col);
            }
        });
    }


    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (tablero.darTablero()[i][j] == false) {
                    g.setColor(Color.YELLOW);
                } else {
                    g.setColor(Color.BLACK);
                }
                g.fillRect(j * cellSize, i * cellSize, cellSize, cellSize);
            }
        }
    }

}


