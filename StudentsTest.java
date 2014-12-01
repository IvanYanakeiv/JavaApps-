

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
public class StudentTest {
    
    public static void main(String[] args) {
        
        
        Student student = new Student(2, 2, 2, 0, "");
        String studentName = JOptionPane.showInputDialog(" Enter student name :");
        student.setName(studentName);
        
        String stID = JOptionPane.showInputDialog(" Enter student ID :");
        int st = Integer.parseInt(stID);
        student.setStudentID(st);

        String mk1 = JOptionPane.showInputDialog(" Input mark1: ");
        int st1 = Integer.parseInt(mk1);
        student.setMark1(st1);

        String mk2 = JOptionPane.showInputDialog(" Input mark2 :");
        int st2 = Integer.parseInt(mk2);
        student.setMark2(st2);

        String mk3 = JOptionPane.showInputDialog(" Input mark3 :");
        int st3 = Integer.parseInt(mk3);
        student.setMark3(st3);
        double aver = student.getAverage(student.getMark1(), student.getMark2(), student.getMark3());
        
        String output = String.format("For student %20s, with  ID: %8d, the average grade is %5.2f  ",
                student.getName(),student.getStudentID(), aver); 
        
        JOptionPane.showMessageDialog(null, output);
        System.exit(0);
    }
 }

