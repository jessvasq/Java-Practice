public class Rectangle extends Shape implements Movable {
    private int x, y;
    //constructor
    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle(double width, double base) {
        super.width = width;
        super.base = base;
    }

    @Override
    public double getArea(){
        return (super.width * super.base);
    }

    @Override
    public void displayShapeName() {
        System.out.println("Drawing a Rectangle of size: " + super.width + super.base);
    }

    @Override
    public String toString() {
        return "Rectangle " + super.toString();
    }

    @Override
    public String getCoordinate() {
        return  "(" + x + "," + y + ")";
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }
}
