/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithms;

/**
 * @author Ivan
 */
public class Main 
{
    public static boolean linearSearch (int[] arr , int key)
    {
        for (int i = 0 ; i < arr.length ; i++)
        {
            if (arr[i] == key)
            {
                return true;
            }
        }
        return false;
    }
    
    public static boolean binarySearch (int[] sortedArr , int key)
    {
        boolean result = false;
        int start = 0;
        int end = sortedArr.length;
        int mid = (start + end)/2;
        
        while (start != end)
        {
            mid = (start + end) /2;
            if (sortedArr[mid] == key)
            {
                result = true;
                break;
            }
            if (sortedArr[mid] > key)
            {
                end = mid;
            }
            if (sortedArr[mid] < key)
            {
                start = mid;
            }
        }
        
        return result;
    }
    
    public static void bubbleSort (int arr[])
    {
        for (int i = 0 ; i < arr.length; i++)
        {
            for (int j = 0 ; j < arr.length - 1 ; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Running");
        int arr[] = {4 ,2 ,6 , 10, 45, -3, -19};
        int key = 2;
        //System.out.println(linearSearch (arr , key));
        int[] sortedArr = {2 ,5 ,9 , 10, 18, 45 , 67 , 100};
        //System.out.println(binarySearch (sortedArr , key));
        bubbleSort (arr);
        for (int i = 0 ; i < arr.length ; i++)
        {
            System.out.printf("%d " , arr[i]);
        }
        System.out.println("");
    }
}
