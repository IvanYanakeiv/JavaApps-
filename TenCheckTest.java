
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
public class TenCheckTest {

    
   
    
    public static void main (String args []){
        
   
        
        TenCheck tenCheck  = new TenCheck();
        boolean result =tenCheck.makes10(9, 1);
        System.out.println(result);
        result = tenCheck.makes10(10, 9);
        System.out.println(result);
        result = tenCheck.makes10(9, 10);
        System.out.println(result);
        result = tenCheck.makes10(-5, 9);
        System.out.println(result);
        
       
    }
            
}
