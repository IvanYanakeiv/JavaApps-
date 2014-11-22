
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
public class CounterTest {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int counter = 1;
        int counterZeros = 0;
        int counterPositive = 0;
        int counterNegative = 0;
        int counterEvennNUM = 0;
        int counterOddNUM = 0;
        int sum = 0;
        while (counter <= 10) {
            counter++;

            System.out.print("Enter integer: ");
            int number = input.nextInt();
            
            if (number == 0) {
                counterZeros++;
            }
            if (number > 0) {
                counterPositive++;
            }
            if (number < 0) {
                counterNegative++;
            }
            if (number % 2==0)  {
                 counterEvennNUM++;
            }else{
                counterOddNUM++;
            }
            sum += number;
        }
        double average = sum / 10.0;
        String message= String.format("Plus are %d\n"+
                "Min are %d \n", counterPositive,counterNegative);
        System.out.println("Result is "+ sum);
        System.out.println("Plus are " + counterPositive);
        System.out.println("Min are " + counterNegative);
        System.out.println("Zero are " + counterZeros);
        System.out.println("Evenn are " + counterEvennNUM);
        System.out.println("Odd are " + counterOddNUM);
        System.out.println("Average is"+average);
        
    }
}
