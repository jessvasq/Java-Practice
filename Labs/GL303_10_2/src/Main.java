//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(100);
        System.out.println("Area of Circle " + c.getArea());

        //sObj, shapeCircleObj, shapeRectangleObj, and shapeTriangleObj. These objects are polymorphic variables.

        // Create an object from the Shape class
        Shape sObj = new Shape();
        sObj.displayShapeName();
        // instanceof operator is a Boolean operator that tests whether an object belongs to a given class.
        System.out.println(sObj instanceof Shape); // true

        // object creation of the Circle class
        System.out.println("+++++++++");

        Shape shapeCircleObj = new Circle(100);  // UpCasting
        shapeCircleObj.displayShapeName();
        System.out.println("Area of Circle " + shapeCircleObj.getArea());
        System.out.println(shapeCircleObj);  // Run circle's toString()

        // Use instanceof operator for Validation
        System.out.println(shapeCircleObj instanceof Circle); // true
        System.out.println(sObj instanceof Circle); // false because Shape is not a Circle

        System.out.println("--------------------");
        Shape shapeRectangleObj = new Rectangle("Red"); //UpCasting
        shapeRectangleObj.displayShapeName();
        shapeRectangleObj.setHeight(2); //method in parent class
        shapeRectangleObj.setWidth(2); //method in parent class
        System.out.println("Area of Rectangle is " + shapeRectangleObj.getArea());
        System.out.println(shapeRectangleObj);  // Run Rectangle's toString()
        // Use instanceof operator for Validation
        System.out.println(shapeRectangleObj instanceof Rectangle); // true
        System.out.println(sObj instanceof Rectangle); // false because Shape is not a Rectangle

        System.out.println("--------------------");
        Shape shapeTriangleObj = new Triangle("Blue"); //UpCasting
        shapeTriangleObj.displayShapeName();
        shapeTriangleObj.setHeight(2); //method in parent class
        shapeTriangleObj.setBase(3); //method in parent class
        System.out.println("Area of Triangle is " + shapeTriangleObj.getArea());
        System.out.println(shapeTriangleObj);  // Run Triangle's toString()

        // Use instanceof operator for Validation
        System.out.println(shapeTriangleObj instanceof Triangle); // true
        System.out.println(sObj instanceof Triangle); // false because Shape is not a Triangle
        System.out.println("--------------------");

        Cylinder cylinderShape = new Cylinder(3); //UpCasting
        cylinderShape.displayShapeName();
        cylinderShape.setHeight(3); //method in parent class
        System.out.println("Area of Cylinder is " + cylinderShape.getVolume());
        System.out.println(cylinderShape);  // Run cylinderShape's toString()

    }
}