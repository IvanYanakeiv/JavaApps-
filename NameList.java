/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan
 */
public class NameList {

    public static void main(String[] args) {

        String[] names = {"Bob", "Alice", "John", "Mike", "Marry", "Alice", "John", "Billy", "Mike", "John"};
        boolean[] isMarkerd = new boolean[names.length];
        int currName = 0;
        int result = 0;

        for (int i = 0; i < names.length; i++) {
            if (!isMarkerd[i]) {
                currName = 1;
                isMarkerd[i] = true;
                for (int j = i; j < names.length; j++) {
                    if (names[i].equals(names[j]) && !isMarkerd[j]) {
                        currName++;
                        isMarkerd[j] = true;
                    }
                }
                if (currName > 1) {
                    result += currName;
                }
            }
        }
        System.out.println(result);
    }
}


