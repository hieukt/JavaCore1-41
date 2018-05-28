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
public class HinhChuNhat {

    static int count = 0;

    public static int chuVi(int chieu_dai, int chieu_rong) {
        return (chieu_dai + chieu_rong) * 2;
    }

    public static void main(String[] args) {
        System.out.println(HinhChuNhat.count);

        HinhChuNhat.count += 1;
        System.out.println(HinhChuNhat.count);
        System.out.println(HinhChuNhat.chuVi(5, 6));

        HinhChuNhat h1 = new HinhChuNhat();
        HinhChuNhat h2 = new HinhChuNhat();

        h1.count = 5;
        System.out.println(HinhChuNhat.count);
        h2.count = 10;
        System.out.println(HinhChuNhat.count);
        int a = h1.chuVi(5, 7);
        System.out.println(a);
    }
}
