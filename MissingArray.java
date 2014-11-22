
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
public class MissingArray {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int lengthOfArray1;
        int lengthOfArray2;
        System.out.println("Input the length of the first array :");
        lengthOfArray1 = reader.nextInt();
        int[] arr1 = new int[lengthOfArray1];
        System.out.println("Input the first array :");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = reader.nextInt();
        }

        System.out.println("Input the length of the second array :");
        lengthOfArray2 = reader.nextInt();
        int[] arr2 = new int[lengthOfArray2];
        System.out.println("Input the second array :");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = reader.nextInt();
        }

        int sum = 0;

        boolean isContained;                                         
        

        System.out.println("The elements which are contained in the first array but not in the second are :");
        for (int i = 0; i < arr1.length; i++) {
            isContained = false;

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    isContained = true;
                    break;

                }
            }
            if (!isContained) {
                System.out.printf("%d ", arr1[i]);
                sum += arr1[i];
            }
            System.out.printf("\nTheir sum is : %d\n", sum);
            System.out.printf("The sum mod 123456789 is : %d\n", sum % 123456789);

        }
    }
}
