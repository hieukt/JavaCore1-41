/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trungtamjava.doituong;

/**
 *
 * @author Lenovo-PC
 */
public class Nguoi {

    String ten;
    String dia_chi;
    int tuoi;

    public void diLai(String ten) {
        System.out.println(ten + " di lai");
    }

    public static void main(String[] args) {
        new Nguoi();
        Nguoi a1 = new Nguoi();
        Nguoi a2 = new Nguoi();

        a1.diLai("hieu");
        a2.diLai("Bach");
    }
}
