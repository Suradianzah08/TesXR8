import java.util.Random;
import java.util.Scanner;

public class Soal3sedang {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Random r= new Random();

        System.out.println("Selamat datang di kuis matenatika: ");
        boolean lanjut = true;

        while (lanjut) {
            int bilanganPertama= r.nextInt(10);
            int bilanganKedua=r.nextInt(10);
            int operator=r.nextInt(3);
            int yangBener=0;
            String simbol="";

            switch (operator) {
                case 0: //perkalian
                    simbol = "*";
                    yangBener= bilanganPertama*bilanganKedua;
                    break;
                case 1: //pembagian
                    simbol = "/";
                    yangBener= bilanganPertama/bilanganKedua;
                    break;
                case 2: //moduls
                    simbol = "%";
                    yangBener= bilanganPertama%bilanganKedua;
                    break;

            }
            System.out.println(bilanganPertama + " " + simbol + " " + bilanganKedua + "=");
            int jawabanUser=s.nextInt();

            if (jawabanUser == yangBener) {
                System.out.println("Jawaban anda benar gays");
            }else{
                System.out.println("JAwaban anda salah! yang benar adalah= " + yangBener);
            }

            System.out.println("apakah anda ingin melanjutkan kuis? (Ya/tidak) ");

            String pilihan= s.next();
            if (pilihan.equalsIgnoreCase("tidak")) {
                lanjut= false;



                
            }
        }
        System.out.println("Terimakasih telah mengikuti kuis! ");
 }

     


        }
    
