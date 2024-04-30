public class FireMonster extends Monster{
    //constructor that takes a single param. A constructor has the same name as the class and does not have a return type
    public FireMonster(String name){
        //The super keyword is used to invoke the superclass constructor. We pass the name parameter up to the superclass constructor so that the superclass can perform the initialization
        super(name);//calls the constructor of the superclass 'Monster' with the name as param
    }

    @Override
    public String attack(){
        return "Attack with fire!";
    }
}
