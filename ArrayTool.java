/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan
 */
public class ArrayTool {
 

    public int findMinimumValue(int array[]) {
        int min=Integer.MAX_VALUE;
        for (int counter = 0; counter < array.length; counter++) {
            if (min > array [counter])
                min = array [counter];
            
        }
        return min;
    }
    
    

    public int findIndexOfMinimumValue(int array[]) {
        int minValue=Integer.MAX_VALUE;
        int minIndex=0;
        for (int counter = 0; counter < array.length; counter++) {
            if (minValue > array [counter]){
                minValue = array [counter];
                minIndex=counter;
            }
        }
        
                
        return minIndex ;
    }

    public double findAvarage(int array[]) {
        
      double sum=0;
      for (int counter = 0; counter < array.length; counter++) {
          sum += array[counter]  ;
          
            
        }   
      
      double average = sum / array.length;
        return average;
    }

}
