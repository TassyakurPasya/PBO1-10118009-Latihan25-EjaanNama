/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejaannama;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * Nama  : Tassyakur Pasya
 * Kelas : IF-01
 * NIM : 10118009
 * Matkul : PBO-01
 * Diskripsi Program : Ejaan Nama 
 */
public class Ejaannama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String nama;
        System.out.print("Masukan Nama Anda Untuk di Eja : ");
        nama = input.next();
        
        char ejaan [] = nama.toCharArray();
        
        for(int i = 0; i < ejaan.length; i++){
            System.out.println("Huruf Ke - " + (i+1) + " : "+ ejaan[i]);
        }
        
        
    }
    
}
