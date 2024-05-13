public class HospitalParking implements ParkingSystem{
    private int time;
    private double surcharge = 0.20;
    private double total = 0;

    public HospitalParking(int time){
        this.time = time;
    }

    @Override
    public double processTicket(){
        // 5AM - 5PM
        if (time >= 5 && time < 17){
            total = MORNING;
        // 5PM - 12AM
        } else if (time >= 17 && time < 24){
            total = NIGHTLY;
        // 12AM - 5AM
        } else {
            total = TWENTY_FOUR;
        }
        //Add Surcharge
        total += total * surcharge;
        return total;
    }

    @Override
    public String toString() {
        return "Price for Hospital Parking is: $" + total;
    }
}
