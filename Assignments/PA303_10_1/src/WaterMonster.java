public class WaterMonster extends Monster {
    //constructor
    public WaterMonster(String name) {
        super(name);
    }

    @Override
    public String attack(){
        return "Attack with water!";
    }
}
