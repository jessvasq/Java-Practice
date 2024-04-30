public class KidUser implements LibraryUser{
    private int age;
    private String bookType;

    //constructor with two parameters
    public KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    //constructor with parameter for bookType only
    public KidUser(String bookType){
        this.bookType = bookType;
    }

    //constructor with parameter for age only
    public KidUser(int age){
        this.age = age;
    }

    @Override
    public String registerAccount(){
        if (age > 0 && age <= 11){
            return "You have successfully registered under a Kids account";
        }else{
            return "Sorry, age must be less than 12 to register as a kid";
        }
    }

    @Override
    public String requestBook(){
        if (bookType.equals("kids")){
            return "Book issued successfully, please return the book within 10 days";
        }else {
            return "Oops, you are allowed to take only kids books.";
        }
    }
}
