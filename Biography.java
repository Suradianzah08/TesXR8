public class Biography extends TextBook {
    String about;

    public String setAbout(){
        this.about=about;
    }

    public Biography(){
        super();
        about="";
    }

    public Biography(String title, String subject, String about, int year, double price){
        super(title, subject, year, price);
        this.about=about;
    }

    public void print(){
        System.out.println("About:" +about);
    }
}
