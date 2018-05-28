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
public class unit31 {
    public static void main(String[] args) {
        BookCase bc = new BookCase();
        bc.setColor("Red");
        System.out.println(bc.getColor());
        bc.setSize(35);
        System.out.println(bc.getSize());
    }
}

class BookCase{
    private int size;
    private String color;
    private boolean good;

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public boolean isGood() {
        return good;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGood(boolean good) {
        this.good = good;
    }
    
    
}
