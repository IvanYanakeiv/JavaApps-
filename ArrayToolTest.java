/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan
 */
public class ArrayToolTest {

    public static void main(String args[]) {

        int array[] = {12, 15, -1, 44, -5, 31, 1, 231, 2, -8};

        ArrayTool myTool = new ArrayTool();

        int min = myTool.findMinimumValue(array);
        int index = myTool.findIndexOfMinimumValue(array);
        double avarage = myTool.findAvarage(array);

        System.out.printf("min is %d index of %d average %f", min, index, avarage);

    }

}
