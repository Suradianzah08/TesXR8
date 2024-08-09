public class Buku {
    int id;
    String judul;
    String pengarang; 
    int tahunTerbit;

    public Buku(int id, String judul, String pengarang, int tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;

    }
    public static void main(String[] args) {
        Buku rodaDua = new Buku(2, "rodaDua", "Mushodikul Umam", 2017);
        Buku priaSigma = new Buku(5,"priaSigma", "Suradianzah Ganteng", 2024);
        Buku pintaKuan = new Buku(7, "pintaKuan", "Suradianzah", 2024);
        Buku cateringEnak = new Buku(2, "cateringEnak", "Suradianzah",2019);
        Buku Cintacinta = new Buku(4, "Cintacinta", "Suradianzah", 2023);

        System.out.println(rodaDua.id);
        System.out.println(rodaDua.judul);
        System.out.println(rodaDua.pengarang);
        System.out.println(rodaDua.tahunTerbit);
        System.out.println(priaSigma.id);
        System.out.println(priaSigma.judul);
        System.out.println(priaSigma.pengarang);
        System.out.println(priaSigma.tahunTerbit);
        System.out.println(pintaKuan.id);
        System.out.println(pintaKuan.judul);
        System.out.println(pintaKuan.pengarang);
        System.out.println(pintaKuan.tahunTerbit);
        System.out.println(cateringEnak.id);
        System.out.println(cateringEnak.judul);
        System.out.println(cateringEnak.pengarang);
        System.out.println(cateringEnak.tahunTerbit);
        System.out.println(Cintacinta.id);
        System.out.println(Cintacinta.judul);
        System.out.println(Cintacinta.pengarang);
        System.out.println(Cintacinta.tahunTerbit);
      
        
        

    
    }
}
