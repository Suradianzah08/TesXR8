import java.util.Scanner;

public class Soal1mudah {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("Masukkan berat paket : ");
        double berat = s.nextDouble();

        System.out.print("Masukkan jarak pengiriman : ");
        double jarak = s.nextDouble();

        System.out.println("Masukkan Panjang : ");
        double panjang=s.nextDouble();
        
        System.out.println("Masukkan Lebar : ");
        double lebar=s.nextDouble();

        System.out.println("Masukkan tinggi : ");
        double tinggi=s.nextDouble();


        double volume= panjang*lebar*tinggi;

        double totalBiaya = hitungBiayaPengiriman(berat, jarak,volume);

        System.out.println("Total biaya pengiriman: Rp " + totalBiaya);
        System.out.println("Volume barang ialah : " +volume+ " cm^3");
    

       
    }
    public static double hitungBiayaPengiriman(double berat, double jarak, double volume) {
        double hargaJarak;

        
        if (jarak <= 10 ) {
            hargaJarak = 4250;
        }else{
            hargaJarak = 6000;
        }


        double biayaPengiriman = berat * hargaJarak; 
        
        if (volume > 100) {
            biayaPengiriman += 50000;
        }

        return biayaPengiriman; 
    }
}
