public class Triangle extends Shape implements Movable{
    private int x, y;

    public Triangle(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Triangle(double base, double height){
        super.base = base;
        super.height = height;
    }
    public double getArea(){
        return (super.base * super.height) / 2;
    }

    @Override
    public void displayShapeName() {
        System.out.println("Drawing a Triangle with dimensions : " + super.height + " " + super.base);
    }

    public String getCoordinate() {
        return  "(" + x + "," + y + ")";
    }

    @Override
    public String toString(){
        return "This is a Triangle " + super.toString();
    }

    @Override
    public void moveUp(){
        y++;
    }

    @Override
    public void moveDown(){
        y--;
    }

    @Override
    public void moveLeft(){
        x--;
    }

    @Override
    public void moveRight(){
        x++;
    }
}
