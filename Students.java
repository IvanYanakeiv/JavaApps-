/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan
 */
public class Students {

    private String name;
    private int studentID;
    private int mark1;
    private int mark2;
    private int mark3;

    public Students(String name, int studentID, int mark1, int mark2, int mark3) {

        setName(name);
        setStudentID(studentID);
        setMark1(mark1);
        setMark2(mark2);
        setMark3(mark3);
    }

    public void setName(String vName) {
        if (vName != null) {
            name = vName;
        }
    }

    public String getName() {
        return name;
    }

    public void setStudentID(int vStudentID) {
        if (vStudentID > 0) {
            studentID = vStudentID;
        }
    }

    public int getStudentID() {
        return studentID;
    }

    public void setMark1(int vMark1) {
        if (vMark1 > 0) {
            mark1 = vMark1;
        }
    }

    public int getMark1() {
        return mark1;
    }

    public void setMark2(int vMark2) {
        if (vMark2 > 0) {
            mark2 = vMark2;
        }
    }

    public int getMark2() {
        return mark2;
    }

    public void setMark3(int vMark3) {
        if (vMark3 > 0) {
            mark3 = vMark3;
        }
    }

    public int getMark3() {
        return mark3;
    }

    public int getAverage() {

        int average;

        average = ( (mark1 + mark2 + mark3) / 3);

        return average;
    }

}