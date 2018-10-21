/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo0210117043_latihan46_tandanyakamu;
import java.util.Scanner;
/**
 *NAMA       : Yusrizal Falahan
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN UMUR 
 * @author Acer
 */
public class PBO0210117043_latihan46_Tandanyakamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner baca = new Scanner(System.in);
        Age man1 = new Age ();
        System.out.print("Masukkan tahun lahir: ");
        man1.setYearBrith(baca.nextInt());
        System.out.println("");
        System.out.println("===Hasil Perhitungan Umur===");
        System.out.println("Tahun Lahir Anda: " +man1.getYearBrith());
        System.out.println("Hari ini Tahun: " +man1.getYearNow());
        System.out.println("Umur kami hari ini adalah: " +man1.hitungumur()+"Tahun");
        man1.tandanyaKamu(man1.hitungumur());
        
        
    }
    
}
