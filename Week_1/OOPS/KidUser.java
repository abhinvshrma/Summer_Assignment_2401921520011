package Week_1.OOPS;

public class KidUser implements LibraryInterface {
    int age;
    String bookType;

    public KidUser(){}

    //setters
    public void setAge(int age) {this.age = age;}
    public void setBookType(String bookType) {this.bookType = bookType;}


    @Override
    public void registerAccount(){
        if(age < 12) System.out.println("You have successfully registered under a Kids Account !!");
        else System.out.println("Age must be under 12 to register as a Kids Account !!");
    }
    @Override
    public void requestBook(){
        if(bookType.equals("Kids")) System.out.println("Book issued succesfully , please return the book under 10 days !!");
        else System.out.println("Oops, you are allowed to take only kids books");
    }
    
}
