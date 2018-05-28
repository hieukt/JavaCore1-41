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
public class Book {

    String ten;
    String mo_ta;
    double price;

    public Book(String ten, String mo_ta) {
        this.ten = ten;
        this.mo_ta = mo_ta;
    }

    public Book() {
    }

    public Book(String ten, String mo_ta, double price) {
        this.ten = ten;
        this.mo_ta = mo_ta;
        this.price = price;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMo_ta() {
        return mo_ta;
    }

    public void setMo_ta(String mo_ta) {
        this.mo_ta = mo_ta;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
