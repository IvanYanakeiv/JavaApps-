
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
public class AccountTest 
{
    public static void main(String args [])
    {
     Account account1 = new Account (50.00);
     Account account2 = new Account (-7.53);
     
     
     System.out.printf("account1 balance: $%.2f\n",
             account1.getBalance() );
     System.out.printf("account2 balance: $%.2f\n\n",
             account2.getBalance() );
     
     Scanner input = new Scanner(System.in);
     double depositAmount;
     
     System.out.print("Enter deposit amount for account1: " );
     depositAmount = input.nextDouble();
     System.out.printf("\nadding %.2f to account1",
             depositAmount);
             
     account1.credit(depositAmount);
     
        System.out.printf("account1 balance $%.2f\n", 
                account1.getBalance());
        System.out.printf("account2 balance $%.2f\n\n",
                account2.getBalance());
        
        System.out.print("Enter deposti amaount for account2 : " );
        depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to account2 balance\n\n",
                depositAmount );
        account2.credit(depositAmount);
        
        System.out.printf("account1 balance $%.2f\n" ,
                account1.getBalance());
        System.out.printf("account2 balance $%.2f\n" ,
                account2.getBalance());
        
              
    }
    
}
