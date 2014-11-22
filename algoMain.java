/*
Uslovie: Da se napishe programa, koqto potrebitelq vuvejda matrica NxM (N - broi redove, M - broi kolonki)
Sled tova potrebitelq vuvejda N na broi stoinoisti. Programata da izvejda true ako i-tata stoinost q 
ima na i-tiq red ot matricata i false ako q nqma.(Da se izpolzva binary search za turesento i bubble sort za sortirovkata
 */
package matrixSearch;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class Main {
    //Algorithm for sorting an array
    public static void bubbleSort (int[] arr){
        for (int i = 0 ; i < arr.length ; i++)          
        {
            for (int j = 0; j < arr.length - 1; j++) {  //The inner loop is incharge of swaping two neighbouring elements
                if (arr[j]  > arr[j+1])                 //if the left element is greater than the right.
                {
                    int tmp = arr[j];   
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    
    public static boolean binarySearch (int[] arr , int key)
    {
        boolean result = false;                         
        int start = 0;                                  //Varuable used to indicate the start of the interval
        int end = arr.length;                           //Varuable used to indicate the end of the interval
        int mid;
        
        while (start != end)
        {
            mid = (start + end)/2;              
            if (arr[mid] == key)                        //if we find a match the job is done
            {
                result = true;
                return result;
            }
            if (arr[mid] > key)                         //if the key is located in the right interval
            {
                end = mid - 1;                          //we change the interval in which we are search from start to mid
            }
            if (arr[mid] < key)                         //if the key is located in the left interval
            {
                start = mid + 1;                        //we change the interval in which we are searching from mid to end
            }
        }
        
        return result;
    }
    public static void main(String[] args)
    {
        Scanner reader = new Scanner (System.in);       //We create a Scanner object with which we are going to read user input
        int n = reader.nextInt();                       //'n' is the number of rows in the matrix
        int m = reader.nextInt();                       //'m' is the number of collums in the matrix
        
        int matrix[][] = new int [n][m];                //We create the matrix here
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = reader.nextInt();        //Here the user gives each cell of the matrix a value
            }
        }
        
        int array[] = new int [n];                      //We create the one dimentional array in which we are going to store the keys
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.nextInt();
        }
        
        for (int i = 0; i < matrix.length; i++) {
            bubbleSort (matrix[i]);                     //We sort the current row (because binary search REQUIRES sorted arrays
            System.out.println(binarySearch(matrix[i] , array[i])); //We print the result of the binary search
        }
        
    }
    
}
