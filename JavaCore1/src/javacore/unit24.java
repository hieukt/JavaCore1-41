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
public class unit24 implements Showable {

    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String args[]) {
        unit24 obj = new unit24();
        obj.print();
        obj.show();
    }
}

interface Printable {

    void print();
}

interface Showable extends Printable {

    void show();
}
