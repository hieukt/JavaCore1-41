/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Lenovo-PC
 */
public class unit35 {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        file.createNewFile();
        File directory = new File("new");
        directory.mkdir();
    }
}
