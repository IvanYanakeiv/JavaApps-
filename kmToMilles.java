
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ivan
 */
public class kmToMilles {

    public static void main(String args[]) {

        String kmStr;
        double km;
        double mi;

        kmStr = JOptionPane.showInputDialog(null, "Enter kilometers.");
        km = Double.parseDouble(kmStr);

        mi = km * 0.621;

        JOptionPane.showMessageDialog(null, km + "kilometers is"
                + mi + " miles.");

    }

}
