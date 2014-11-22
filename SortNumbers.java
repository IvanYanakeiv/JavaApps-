
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
public class SortNumbers {
    
    public static void main (String args [] ){
        
        int[] i1 = new int[]{-1,5,-7,18,-14};
        
         System.out.print("Original Array : ");
        for(int index=0; index < i1.length ; index++)
        System.out.print("  "  + i1[index]);
        
         Arrays.sort(i1);
  
    System.out.print("Sorted int array : ");
    for(int index=0; index < i1.length ; index++)
      System.out.print("  "  + i1[index]);
    }
}
