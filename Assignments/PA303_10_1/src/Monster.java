//superclass - defines the expected behaviors
public class Monster {
    private String name;

    //Constructor that accepts one parameter
    public Monster(String name) {
        this.name = name;
    }

    //method to be overridden by subclasses
    public String attack(){
        return "!^_&^$@+%$* I don't know how to attack!";
    }
}
