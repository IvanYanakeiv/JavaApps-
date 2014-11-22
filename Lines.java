
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ivan
 */
public class Lines extends JPanel {

    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        setBackground(Color.WHITE);

        int y = 0;
        int counter = 0;

        while (y < height) {

            if (counter % 2 == 0) {
                g.setColor(Color.RED);
            } else {
                g.setColor(Color.GRAY);
            }

            g.drawLine(0, y, width, 0);
            y = y + 10;
            counter++;
        }
    }

}
