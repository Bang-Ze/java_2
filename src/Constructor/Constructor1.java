package Constructor;

class Book{
    private Integer Id;
    private String Title;
    //
    public Book(){}
    public Book(Integer id, String title){
        this.Id = id;
        this.Title = title;
    }
    public void setId(Integer id){
        this.Id = id;
    }
    public int getId(){
        return this.Id;
    }
    public void setTitle(String title){
        this.Title = title;
    }
    public String getTitle(){
        return this.Title;
    }
    @Override
    public String toString() {
        return "book " +
                "Id = " + Id +
                ", Title = " + Title ;
    }
}
public class Constructor1 {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println("Value of object 1: " + book1);
        Book book2 = new Book(2, "Nezha");
        System.out.println("Value of object 2: " + book2);
        Book book3 = new Book();
        book3.setId(12);
        System.out.println("value of id of object 3: " + book3.getId());
        Book book4 = new Book();
        book4.setTitle("Coco");
        System.out.println("value of id of object 4: " + book4.getTitle());
    }
}