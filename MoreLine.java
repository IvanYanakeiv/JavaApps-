
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
public class MoreLine extends JPanel {

    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        g.setColor(Color.red);
        g.drawLine(width / 4, height / 4, width / 2, height / 4);
        g.setColor(Color.blue);
        g.drawLine(width - width / 4, height / 4, width - width / 2, height / 4);
        g.setColor(Color.green);
        g.drawLine(width / 2, height / 2, width / 2, height / 4);
        g.setColor(Color.black);
        g.drawLine(width / 2, height / 2, width / 2, height - height / 4);
        g.setColor(Color.blue);
        g.drawLine(width / 4, height - height / 4, width / 2, height - height / 4);
        g.setColor(Color.red);
        g.drawLine(width / 2, height - height / 4, width - width / 4, height - height / 4);
    }
}