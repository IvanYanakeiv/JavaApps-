
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ivan
 */
public class GradeBookTest {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        GradeBook myGradeBook = new GradeBook();

        System.out.println("Please enter the course name : ");
        String nameOfCourse = input.nextLine();
        System.out.println();

        myGradeBook.determinecClassAvarage();
    }

}
