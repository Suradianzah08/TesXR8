import java.util.Scanner;
public class Lingkaran {
    public static void main(String[] args) {
        System.out.println("Selamat datang di program luas lingkaran");
        double jari_jari;
        double pi = 3.14;
        double rumus;
        Scanner masukan = new Scanner(System.in);

        System.out.println("Nilai jari2: ");
        jari_jari = masukan.nextDouble();

        rumus = pi * jari_jari * jari_jari;
        System.out.println("Luas lingkaran adalah: " + rumus);

    }
}