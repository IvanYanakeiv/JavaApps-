
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
public class TwoMatrixArray {

    public static void main(String[] args) {

        int n, m;
        Scanner reader = new Scanner(System.in);

        n = reader.nextInt();
        m = reader.nextInt();

        int matrix[][] = new int[n][m];

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++) 
            {
                matrix[i][j] = reader.nextInt();
            }
        }
        
        for (int i = 0; i < matrix.length; i++)
            {
                if(search(matrix[i]))
            System.out.println(i);
            }
        
        
    }
    public static boolean search(int[]arr) {

        for (int i = 0; i < arr.length - 1; i++) 
        {
            for (int j = i + 1; j < arr.length; j++)
            {

                if (arr[i] == arr[j])
                {
                    return false;
                }
            }
            
        }
        return true;
    }
}
