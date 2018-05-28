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
public class NhanVien {

    private String ten;
    private String dia_chi;
    private int tuoi;

    public NhanVien(String ten, String dia_chi, int tuoi) {
        this.ten = ten;
        this.dia_chi = dia_chi;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

}
