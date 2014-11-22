/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan
 */
public class Arrow {

    public static void main(String args[]) {

        String x = "-";

        for (int i = 1; i <= 10; i++) {

            if (i <= 10) {

                System.out.print(x);
                x += "-";
                
            }

            System.out.println(">");

        }

    }
}
