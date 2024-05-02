import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Instantiate
        AddDataToArrayList b = new AddDataToArrayList();
        ArrayList<Book> myBookList = b.bookDetails();

        //enhanced loop
        for (Book showValue : myBookList) {
            //invoking getter method to get data
            System.out.println(showValue.getNumber() + " " + showValue.getName() + " " + showValue.getCategory() + " " + showValue.getAuthor());
        }
    }
}