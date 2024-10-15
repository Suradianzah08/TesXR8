public class Novel extends Book {
    String genre;

    public String getGenre(){
        return this.genre;
    }

    public void setGenre(){
        this.genre=genre;
    }

    public Novel(){
        super();
        genre="Drama";
    }

    public Novel(String genre, String title, int year, double price){
        super(title, year, price);
        this.genre=genre;
    }

    public void print(){
        System.out.println("Genre:" +genre);
    }


}
