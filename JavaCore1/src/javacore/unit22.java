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
public class unit22 {
    public static void main(String[] args) {
        A a1 = new A();
        a1.setName("Hieu");
        System.out.println(a1.getName());
        
        B b1 = new B();
    }
}

class A{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

class B{
    
}
