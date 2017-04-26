
package LatihanSoal;

public class Main {
    public static void main(String[] args) {
         SoftwareEngineer SE1 = new SoftwareEngineer ("Kukuh","Software Engineer",4);
         System.out.println("Nama: "+SE1.getNama()+"\nPosisi: "+SE1.getPosisi()+"\nMasa Kerja: "+SE1.getLamaKerja()+"\nTotal Gaji: "+SE1.totalGaji());
         SoftwareEngineer SE2 = new SoftwareEngineer ("Iqbal","Software Engineer",5.5);
         System.out.println("Nama: "+SE2.getNama()+"\nPosisi: "+SE2.getPosisi()+"\nMasa Kerja: "+SE2.getLamaKerja()+"\nTotal Gaji: "+SE2.totalGaji());
         ProjectManager PM1 = new ProjectManager("Hudi","Project Manager",5);
         System.out.println("Nama: "+PM1.getNama()+"\nPosisi: "+PM1.getPosisi()+"\nMasa Kerja: "+PM1.getLamaKerja()+"\nTotal Gaji: "+PM1.totalGaji());
         ProjectManager PM2 = new ProjectManager("Jati","Project Manager",11);
         System.out.println("Nama: "+PM2.getNama()+"\nPosisi: "+PM2.getPosisi()+"\nMasa Kerja: "+PM2.getLamaKerja()+"\nTotal Gaji: "+PM2.totalGaji());
    }
}
