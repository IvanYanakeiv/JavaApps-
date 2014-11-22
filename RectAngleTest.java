/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan
 */
public class RectAngleTest {

    public static void main(String args[]) {

        RectAngle rectAngle = new RectAngle(25, 25);
        RectAngle rectAngle2 = new RectAngle(15, 45);
        RectAngle rectAngle3 = new RectAngle( rectAngle2 );
        System.out.println("Perimeter is " + rectAngle.calculatePerimeter());
        System.out.println("Area is " + rectAngle.calculateArea());
        System.out.println("Perimeter " + rectAngle2.calculatePerimeter());
        System.out.println("Area is " + rectAngle2.calculateArea());
        System.out.println("Perimeter is " + rectAngle3.calculatePerimeter());
        System.out.println("Area is " + rectAngle3.calculateArea());

    }

}
