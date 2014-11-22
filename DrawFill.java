
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
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
public class DrawFill extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponents(g);
        
        g.setColor (Color.BLUE);
        
        Font f = new Font("My Font" , Font.BOLD, 20);
        g.setFont(f); 
        g.drawString("The House I DO NOT want to have!", 20 ,20); 
        
        
        int [] xPoints = {getWidth()/4 , 3 * getWidth()/4 , getWidth() / 2 };
        int [] yPoints = {getHeight()/2 , getHeight()/2 , getHeight()/16 };
        
        g.setColor(Color.red);

        g.fillPolygon(xPoints, yPoints, xPoints.length);
        
        g.setColor(Color.GREEN);
        g.fillRect(getWidth()/4 + getWidth()/64,getHeight()/2 , getWidth()/2 - getWidth()/32 , getHeight()/2 - 5);
        
        g.setColor(Color.BLACK);
        
        g.fillArc(2*getWidth()/5,3*getHeight()/4, 2*getWidth()/10, getHeight()/15, 0, 180);
        
        g.fillRect(2*getWidth()/5,3*getHeight()/4 + getHeight()/30, 2*getWidth()/10, getHeight()/4 - getHeight()/30 - 5);
        
        

    }
}
