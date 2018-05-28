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
public class unit26 extends Employee1 {

    int bonus = 10000;

    public static void main(String args[]) {
        unit26 p = new unit26();
        System.out.println("Luong Lap trinh vien la:" + p.salary);
        System.out.println("Bonus cua Lap trinh vien la:" + p.bonus);
    }
    private String salary;

}

class Employee1 {

    float salary = 40000;
}
