
package LatihanSoal;


public class SoftwareEngineer extends Perusahaan{
    private int tunjangan=5500000;
    public SoftwareEngineer (String Nama,String posisi,  double lamaKerja){
    super (Nama, posisi, lamaKerja);
}
   
public double getBonus(){
   return super.getBonus() + 300000;
}
    public double totalGaji(){
        return getGajiPokok()+tunjangan+getBonus();
    }
}
