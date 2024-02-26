package inherit.Library;

public class LibraryItem {
    private String itemId;
    private  String title;
    private  String author;

    public void checkOut(){
        System.out.println("CheckOut");
    }
    public void returnItem(){
        System.out.println("Return Item");
    }

}
