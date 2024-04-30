public class StoneMonster extends Monster {
    //constructor that accepts one parameter
    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack(){
        return "Attack with stones!";
    }
}
