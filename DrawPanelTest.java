
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan
 */
public class DrawPanelTest {
    
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setSize(250, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DrawPanel myPanel = new DrawPanel();
        frame.add(myPanel);
    }
    
}
