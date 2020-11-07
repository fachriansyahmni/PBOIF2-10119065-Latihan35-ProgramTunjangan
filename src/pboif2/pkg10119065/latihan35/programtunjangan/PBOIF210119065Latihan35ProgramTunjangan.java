package pboif2.pkg10119065.latihan35.programtunjangan;

import java.util.Scanner;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program tunjangan 
                          dengan objek
 */
public class PBOIF210119065Latihan35ProgramTunjangan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan?  : ");
        int usGaji = sc.nextInt();
        System.out.print("Status anda? (Menikah/Belum)      : ");
        String usStatus = sc.next();
        System.out.println("");
        
        HitungGaji hitungGaji = new HitungGaji(usGaji,usStatus);
    }
    
}
