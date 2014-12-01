/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan
 */
public class Student {

    private String name;
    private int studentID;
    private int mark1;
    private int mark2;
    private int mark3;
 

    public Student(int m1, int m2, int m3, int sID, String name) {
        
        setName(name);
        setStudentID(sID);
        setMark1(m1);
        setMark2(m2);
        setMark3(m3);

    }

    public Student() {
        
        setName("");
        setStudentID(0);
        setMark1(0);
        setMark2(0);
        setMark3(0);

    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getMark1() {

        return mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public int getMark3() {
        return mark3;
    }

    public void setName(String name0) {
        this.name = name0;
    }

    public void setStudentID(int studentIDa) {
        if (studentIDa > 0) {
            this.studentID = studentIDa;
        }
    }

    public void setMark1(int mark1a) {
        if (mark1a >= 2 || mark1a <= 6) {
            this.mark1 = mark1a;
        }
    }

    public void setMark2(int mark2a) {
        if (mark2a >= 2 || mark2a <= 6) {
            this.mark2 = mark2a;
        }
    }

    public void setMark3(int mark3a) {
        if (mark3a >= 2 || mark3a <= 6) {
            this.mark3 = mark3a;
        }
    }

    public double getAverage(int i1, int i2, int i3) {
        double result;
        result = ((double) i1 + (double) i2 + (double) i3) / 3;
        return result;
    }

}
