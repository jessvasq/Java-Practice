public class Main {
    public static void main(String[] args) {
       //Example 1
        HospitalParking ticketOne = new HospitalParking(5);
        ticketOne.processTicket();
        System.out.println(ticketOne);
        //Example 2
        MallParking ticketTwo = new MallParking(5);
        ticketTwo.processTicket();
        System.out.println(ticketTwo);
    }
}