
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
public class GradeBook {

    public void determinecClassAvarage() {

        Scanner input = new Scanner(System.in);

        int total;
        int gradeCounter;
        int grade;
        double average;

        total = 0;
        gradeCounter = 0;

        System.out.print("Enter grade or -1 to quit: ");
        grade = input.nextInt();

        while (grade != -1) {
            total = total + grade;
            gradeCounter = gradeCounter + 1;
            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }
        if (gradeCounter != 0) {
            average = (double) total / gradeCounter;

            System.out.printf("\nTotal of the %d grades entered is %d\n",
                    gradeCounter, total);
            System.out.printf("Clas average is %.2f\n", average);

        } else {
            System.out.printf("No grades were entered");
        }
    }
}
