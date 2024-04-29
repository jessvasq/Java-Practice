public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(1, 2, 2);
        System.out.println("Area of Circle " + c1.getArea());
        System.out.println("Coordinates are " + c1.getCoordinate());

        c1.moveDown();
        System.out.println("After move Down, Coordinates are " + c1.getCoordinate());

        c1.moveRight();
        System.out.println("After move right, Coordinates are " + c1.getCoordinate());

        c1.moveUp();
        System.out.println("After move Up, Coordinates are " + c1.getCoordinate());

        c1.moveLeft();
        System.out.println("After move left, Coordinates are " + c1.getCoordinate());

        System.out.println("--------Test Polymorphism-------");
        Movable c2 = new Circle(5, 10, 200);  // upcasting
        c2.moveUp();
        System.out.println("After move up , Coordinates are " + c2.getCoordinate());

        System.out.println("TRIANGLE ");
        c2.moveLeft();
        System.out.println("After move Left , Coordinates are " + c2.getCoordinate());

        Triangle t1 = new Triangle(3, 6);
        t1.moveDown();
        System.out.println("After move Down, Coordinates are " + t1.getCoordinate());
        t1.moveRight();
        System.out.println("After move right, Coordinates are " + t1.getCoordinate());
        t1.moveUp();
        System.out.println("After move Up, Coordinates are " + t1.getCoordinate());
        t1.moveLeft();
        System.out.println("After move left, Coordinates are " + t1.getCoordinate());

        System.out.println("--------Test Polymorphism-------");
        Movable t2 = new Triangle(3, 6); //We can upcast subclass instances to the Movable interface via Polymorphism
        t2.moveUp();
        System.out.println("After move up , Coordinates are " + t2.getCoordinate());
        t2.moveLeft();
        System.out.println("After move left, Coordinates are " + t2.getCoordinate());

        System.out.println("RECTANGLE");
        Rectangle r1 = new Rectangle(15, 10);
        r1.moveUp();
        System.out.println("After move up, Coordinates are " + r1.getCoordinate());
        r1.moveLeft();
        System.out.println("After move left, Coordinates are " + r1.getCoordinate());
        r1.moveRight();
        System.out.println("After move right, Coordinates are " + r1.getCoordinate());
        r1.moveDown();
        System.out.println("After move down, Coordinates are " + r1.getCoordinate());
        System.out.println("--------Test Polymorphism-------");
        Movable r2 = new Rectangle(8, 14);
        r2.moveDown();
        System.out.println("After move down, Coordinates are " + r2.getCoordinate());
        r2.moveRight();
        System.out.println("After move right, Coordinates are " + r2.getCoordinate());
    }
}