/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan
 */
public class Devisions {
    
    public static double myDevison (int a , int b)
    {
        double result = 0;
        try
        {
            result = a / b;
           
        }
        catch(Exception ex )
        {
            ex.printStackTrace();
        }    
        finally
        {
            return result;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(myDevison(5 , 0));
    }
  
}
