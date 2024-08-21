import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Gajikaryawan {

    public static void main(String[] args) throws InterruptedException {
        
        //mulai

        System.out.println("Gaji karyawan akuwhhh");
        
        // input tarif perjam

        System.out.println("nilai tarif perjam. (angka doang)");
        int tarif = new Scanner(System.in).nextInt();

        // jam kerja

        System.out.println("Masukkan jam kerja beliau. (angka doang)");
        int jam = new Scanner(System.in).nextInt();


        //hitungan gaji

        float gaji = (tarif * jam) - ((tarif * jam) * 10/100);

        //output


        System.out.println("Mohon tunggu hasil gaji karyawan mu");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Gaji anda adalah Rp" + gaji + ".");
        System.out.println("itu gajimu. sekian terimagaji");
        


    




    }
}