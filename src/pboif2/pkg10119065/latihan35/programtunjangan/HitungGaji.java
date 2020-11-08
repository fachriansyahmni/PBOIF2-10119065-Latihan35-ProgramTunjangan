package pboif2.pkg10119065.latihan35.programtunjangan;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program tunjangan 
                          dengan objek
 */
public class HitungGaji {
    public double tunjangan = 0;
    
    public HitungGaji(int usGaji,String usStatus)
    {
        if(cekStatus(usStatus)){
            tunjangan = 0.35 * usGaji;
        }
        
        System.out.println("------Hasil Perhitungan Gaji Anda------");
        System.out.println("Gaji Pokok          : Rp. "+usGaji);
        System.out.println("Tunjangan           : Rp. "+tunjangan);
        System.out.println("Total Gaji          : Rp. "+ (usGaji + tunjangan));
        System.out.println("(Developed by : Fachriansyah Muhammad Nur Ihsan)");
    }
    
    private boolean cekStatus(String usStatus)
    {
        if(usStatus.equals("Menikah") || usStatus.equals("menikah")) return true;
        return false;
    }
}
