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
public class unit29 {
    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.println(b1.getSize());
        System.out.println(b1.getColor());
        
        Box b2 = new Box(15,"Blue");
        System.out.println(b2.getSize());
        System.out.println(b2.getColor());
        
    }
}

class Box{
    private int size;
    private String color;
    
    public Box(){
        size = 10;
        color = "red";
        
        System.out.println("Study and Share");
    }
    
    public Box(int size,String color){
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
    
    
}
