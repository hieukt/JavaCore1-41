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
public class unit23 {

    public static void main(String[] args) {
        Outer ot = new Outer();
        ot.show();
    }
}

class Outer {

    public void show() {
        Inner i = new Inner();
        i.display();
    }

    class Inner {

        public void display() {
            System.out.println("I am inner class");
        }
    }
}

class C {

    public void show() {
        Outer.Inner in = new Outer().new Inner();
        in.display();
    }
}
