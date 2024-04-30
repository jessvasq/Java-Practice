public class Main {
    public static void main(String[] args) {
        //Create an instance of the KidUser class
        KidUser kidUser = new KidUser(10, "kids");
        System.out.println(kidUser.registerAccount());
        System.out.println(kidUser.requestBook());
        KidUser kidUser1 = new KidUser(18, "fiction");
        System.out.println(kidUser1.registerAccount());
        System.out.println(kidUser1.requestBook());

        System.out.println("------------------------");
        //Create an instance of the AdultUser class.
        AdultUser adultUser = new AdultUser(5, "kids");
        System.out.println(adultUser.registerAccount());
        System.out.println(adultUser.requestBook());
        AdultUser adultUser1 = new AdultUser(23, "fiction");
        System.out.println(adultUser1.registerAccount());
        System.out.println(adultUser1.requestBook());
    }
}