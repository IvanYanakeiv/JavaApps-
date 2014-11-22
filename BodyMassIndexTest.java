
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
public class BodyMassIndexTest {

    public static void main(String args[]) {

        double bmi;
        String mass;
        String height;
        String classification="";

        mass = JOptionPane.showInputDialog("Enter you weight in kilograms");
        double vMass = Double.parseDouble(mass);
        height = JOptionPane.showInputDialog("Enter height in meters");
        double vHeight = Double.parseDouble(height);
        
        BodyMassIndex objBMI = new BodyMassIndex(vMass, vHeight);
        bmi = objBMI.calculateBMI();
        
        JOptionPane.showMessageDialog(null, "Your BMI is: " + bmi);

        if (bmi < 18.5) {
            classification = " Underweight";
        }
        if (bmi < 25 && bmi > 18.5) {
            classification = "Normal";
        }
        if (bmi < 30 && bmi > 25) {
            classification = " Overweight";
        } 
        if(bmi>30){
            classification = " DoubleOverweight ";
        }

        JOptionPane.showMessageDialog(null, " Your classification is : " + classification);

    }
}
