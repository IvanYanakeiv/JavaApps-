
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
public class StudentsTest {

    public static void main(String args[]) {
        
        String vName = null;
        int vStudentID = 0;
        int vMark1 = 0;
        int vMark2 = 0;
        int vMark3 = 0;

        Students newStudents = new Students(vName, vStudentID, vMark1, vMark2, vMark3);
        
        String name = JOptionPane.showInputDialog(vName);
        System.out.print("Enter name ");
        
        System.out.println();
        
        String StudentID = JOptionPane.showInputDialog(vStudentID);
        System.out.print("Enter ID ");
        
        System.out.println(newStudents.getAverage());

    }

}

