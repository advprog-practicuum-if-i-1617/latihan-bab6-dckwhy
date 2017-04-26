
package LatihanSoal;


public class ProjectManager extends Perusahaan{
    private int tunjangan = 6000000;
    public ProjectManager (String Nama,String posisi,  double lamaKerja){
        super (Nama, posisi, lamaKerja);
    }
    
    public double getBonus(){
        if (getLamaKerja()>=10) {
            return super.getBonus()+700000+450000;
        }else {
            return super.getBonus()+(450000/2);
        }
    }
    public double totalGaji(){
        return getGajiPokok()+getBonus()+tunjangan;
    }
    
    
}
