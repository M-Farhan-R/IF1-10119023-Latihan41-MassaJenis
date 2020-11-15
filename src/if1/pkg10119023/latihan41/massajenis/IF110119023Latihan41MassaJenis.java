/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan41.massajenis;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : program menghitung massa jenis
 *
 */
import java.util.Scanner;
public class IF110119023Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Kubus k = new Kubus();
        k.setSisi(5);
        k.setMassa(250);
        int s = k.getSisi();
        int m = k.getMassa();
        System.out.println("=====Massa Jenis=====");
        System.out.println("Sisi : "+s);
        System.out.println("Massa : "+m);
        System.out.println();
        
        int v = k.hitungVolume(s);
        int p = k.hitungMassaJenis(m, v);
        
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("Volume : "+v);
        System.out.println("Massa Jenis : "+p);
        
    }

}
