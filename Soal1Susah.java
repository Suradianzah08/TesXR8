import java.util.Scanner;

public class Soal1Susah {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Masukkan jumlah siswa yang ada di kelas: ");
        int siswa= s.nextInt();

        if (siswa <= 0 ) {
            System.out.println("Siswa harus lebih dari 0");
            
        }else{
            double totalNilai=0;

            for (int i = 1; i <= siswa; i++) {
                System.out.println("Masukkan nilai siswa ke-" +i+ ": ");
                double nilai=s.nextDouble();

                if (nilai < 0 || nilai > 100) {
                    System.out.println("Angka harus di antara 0 - 100");
                }else{
                     totalNilai += nilai;
                }
                
            }

            double rataRata = totalNilai / siswa;

            System.out.println("Rata-rata nilai dari banyaknya " +siswa+ " Siswa adalah: " +rataRata );
        }

       s.close();





    }
}
