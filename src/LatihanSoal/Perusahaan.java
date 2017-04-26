
package LatihanSoal;


public class Perusahaan {
    private String Nama,posisi;
    private int gajiPokok;
    private     double bonus;
    private double lamaKerja;

    public Perusahaan(String Nama,String posisi,  double lamaKerja) {
        this.Nama = Nama;
        this.posisi = posisi;
        this.lamaKerja = lamaKerja;
        this.gajiPokok = 2500000;
    }

    public String getNama() {
        return Nama;
    }

    public String getPosisi() {
        return posisi;
    }

    public double getLamaKerja() {
        return lamaKerja;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }
    
    public double getBonus (){
        if (lamaKerja > 5) {
         return   bonus = 500000/2;
        }else {
           return bonus = 0;
        }
    }
    
}
