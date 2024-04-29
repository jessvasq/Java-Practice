public interface Movable {
    //An Interface is similar to an abstract class with no fields and all abstract methods.
    //Interfaces cannot be instantiated — they can only be implemented by classes.
    //An Interface is a design contract. It specifies methods, classes and behavior

    void moveUp();
    void moveDown();
    void moveRight();
    void moveLeft();
    String getCoordinate();
}
