/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore;

import java.util.HashMap;

/**
 *
 * @author Lenovo-PC
 */
public class unit37 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("instructor", "Ducky");
        map.put(new Integer(5), "VietNam");
        map.put("blog", "Test");
        System.out.println(map.get("instructor"));
        System.out.println(map.size());
        map.remove("blog");
        System.out.println(map.get("blog"));
        map.clear();
    }
}
