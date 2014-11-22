
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
public class OvalCircle extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        int x = 20;
        int counter = 0;
        int ovalSize = 40;
        setBackground(Color.WHITE);
        while (x < width) {

            if (counter % 2 == 0) {
                g.setColor(Color.RED);
            } else {
                g.setColor(Color.BLUE);
            }
            g.drawOval(x - (ovalSize / 2), (height / 2) - ovalSize / 2, ovalSize, ovalSize);

            x = x + ovalSize / 2;
            counter++;

        }
    }

}
