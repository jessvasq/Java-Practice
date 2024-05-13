public class MallParking implements ParkingSystem {
    private int time;
    private double surcharge = 0.10;
    private double total;

    public MallParking(int time) {
        this.time = time;
    }

    @Override
    public double processTicket(){
        if (time >= 5 && time <= 17){
            total = MORNING;
        } else if (time >= 17 && time <= 24){
            total = NIGHTLY;
        } else {
            total = TWENTY_FOUR;
        }
        total += total * surcharge;
        return total;
    }

    @Override
    public String toString(){
        return "Price for hospital parking: $" + total;
    }
}
