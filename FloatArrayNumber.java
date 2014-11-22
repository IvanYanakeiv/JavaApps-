
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ivan
 */
public class FloatArrayNumber {

    public static void main(String args[]) {

        double[] array = new double[]{3, 2, 5, 4, 1};

        System.out.print("Reverse Order Array : ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print("  " + array[i]);
        }

        System.out.println("");

        System.out.print("  Original Array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("  " + array[i]);
        }
        System.out.println("");
        System.out.println();

        int i = 0;
        while (i < array.length) {
            System.out.print("  " + array[i]);
            i++;
        }
        i = array.length - 1;
        System.out.println();
        while (i >= 0) {
            System.out.print("  " + array[i]);
            i--;

        }
    }

}
