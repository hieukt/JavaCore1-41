/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore;

import java.util.ArrayList;

/**
 *
 * @author Lenovo-PC
 */
public class unit36 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add("TrungHieu");
        a1.add(new String("Ducky"));
        a1.add(new Integer(5));
        a1.add(new Long(10));
        System.out.println(a1.get(1));
        System.out.println(a1.get(3));
        a1.remove(3);
        System.out.println(a1.get(3));
    }
}
