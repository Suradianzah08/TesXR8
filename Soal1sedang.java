import java.util.Scanner;

public class Soal1sedang {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Masukkan bilangan positif: ");
        int bilangan=s.nextInt();

        if (bilangan < 0) {
            System.out.println("Bilangan Harus positif");
            
        }else{
            int faktorial= menghitungFaktorial(bilangan);
            System.out.println("Faktorial dari " +bilangan+ " yaitu " +faktorial);
           
        }


    }

    public static int menghitungFaktorial(int bilangan){
    
        int hasil=1;
        for (int i = 1; i <= bilangan; i++) {

            hasil*=i;
            
        }

        return hasil;



    }
    }

