
import bangunDatar.*;
import bangunRuang.*;


/**
 *
 * @author khulu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Bangun Datar : \n");
        
        Lingkaran lingkaran = new Lingkaran(14);
        System.out.println("Lingkaran :");
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
        lingkaran.printInfo();
        
        Persegi persegi = new Persegi(5);
        System.out.println("\nPersegi :");
        persegi.hitungLuas();
        persegi.hitungKeliling();
        persegi.printInfo();
        
        PersegiPanjang persegipan = new PersegiPanjang(2, 3);
        System.out.println("\nPersegi Panjang :");
        persegipan.hitungLuas();
        persegipan.hitungKeliling();
        persegipan.printInfo();
        
        System.out.println("\nBangun Ruang : \n");
        
        Balok balok = new Balok(2, 3, 6);
        System.out.println("Balok : ");
        balok.hitungLuas();
        balok.hitungKeliling();
        balok.hitungVolume();
        balok.printInfo();
        
        Bola bola = new Bola(5);
        System.out.println("\nBola : ");
        bola.hitungLuas();
        bola.hitungVolume();
        bola.printInfo();
        
        Kubus kubus = new Kubus(2);
        System.out.println("\n Kubus : ");
        kubus.hitungLuas();
        kubus.hitungKeliling();
        kubus.hitungVolume();
        kubus.printInfo();          
        
        // TODO code application logic here
    }
    
}
