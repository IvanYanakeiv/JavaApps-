
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
public class OvalCircle2 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        int y = 20;
        int counter = 0;
        int ovalSize = 50;

        setBackground(Color.WHITE);

        while (y < width) {

            if (counter % 2 == 0) {
                g.setColor(Color.RED);
            } else {
                g.setColor(Color.BLUE);
            }

            g.drawOval(width / 2, y - (ovalSize / 2), ovalSize, ovalSize);

            y = y + ovalSize / 2;
            counter++;

        }

    }
}
