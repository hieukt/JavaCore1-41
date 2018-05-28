/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore;

/**
 *
 * @author Lenovo-PC
 */
public class JavaCore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int result;

        result = a + b;
        a += b;
        System.out.println(a);
        System.out.println(a / b);
        System.out.println(a % b);

        String country = "VietNam ";
        country = country + "tuoi dep";
        System.out.println(country);

        int a1 = 0;
        int b1 = 3;
        if ((a1 < 10) && (b1 > 5)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if ((a1 < 10) || (b1 > 5)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        int age = 10;
        switch (age) {
            case 0:
                System.out.println("Zero");
                break;
            case 10:
                System.out.println("Ten");
                break;
            case 20:
                System.out.println("ABC");
                break;
            default:
                System.out.println("Default");
                break;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
        }

        int i1 = 0;
        while (i1 < 10) {
            System.out.println("i1: " + i1);
            i1++;
        }

        int i2 = 0;
        do {
            System.out.println("i2: " + i2);
            i2++;
        } while (i2 < 10);

        int[] arr1 = new int[10];
        int[] arr2 = {1, 2, 3, 4};
        int[][] arr3 = new int[2][3];
        String[] arr4 = new String[5];
        JavaCore[] javaCores = new JavaCore[5];
        for (int i = 0; i < 2; i++) {
            for(int j = 0;j < 3;j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
