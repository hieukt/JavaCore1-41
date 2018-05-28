/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trungtamjava.doituong;

import java.util.Scanner;
import com.trungtamjava.doituong.NhanVien;

/**
 *
 * @author Lenovo-PC
 */
public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.setTen("Hieu");
        p1.setTuoi(10);

        p2.setTen("Bach");
        p2.setTuoi(20);

        System.out.println(p1.getTen() + " " + p1.getTuoi());
        System.out.println(p2.getTen() + " " + p2.getTuoi());

        Book b1 = new Book();
        b1.setTen("abc");
        b1.setMo_ta("xyz");
        b1.setPrice(1234);

        Book b2 = new Book("hieu", "ahihihi");
        System.out.println(b2.getTen() + " " + b2.getMo_ta());

        int mang[] = new int[5];
        NhanVien[] nv1 = new NhanVien[3];
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Vui long nhap vao gia tri: ");
        for (int i = 0; i < nv1.length; i++) {
            String ten = sc1.nextLine();
            String dia_chi = sc1.nextLine();
            int tuoi = sc1.nextInt();

            nv1[i] = new NhanVien(ten, dia_chi, tuoi);
            sc1.nextLine();
        }

        for (NhanVien nv : nv1) {
            System.out.println(nv.getTen()+" "+nv.getDia_chi()+" "+nv.getTuoi());
        }
    }
}
