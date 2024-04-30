public class AdultUser implements LibraryUser {
    private int age;
    private String bookType;

    //constructor with two parameters
    public AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    //constructor with a single parameter
    public AdultUser(int age) {
        this.age = age;
    }

    public AdultUser(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public String registerAccount(){
        if (age >= 12) {
            return "You have successfully registered under an Adult Account.";
        } else {
            return "Sorry, age must be greater than 12 to register as an adult.";
        }
    }

    @Override
    public String requestBook(){
        if(bookType.equals("fiction")){
            return "Book Issued successfully, please return the book within 7 days.";
        }else{
            return "Oops, you are allowed to take only adult Fiction books.";
        }
    }
}
