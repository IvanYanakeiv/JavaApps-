
import java.awt.Color;
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
public class DrawFillTest {

    public static void main(String[] args) {

        JFrame myFrame = new JFrame();
        myFrame.setSize(500, 500);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setTitle("The House");
        myFrame.setBackground(Color.WHITE);

        DrawFill myFill = new DrawFill();
        myFrame.add(myFill);

    }

}
