public class Square extends Shape{
    private double a;

    public Square(double a) {
        this.a=a;
    }
    public String getType() {
        return "Square";
    }
    public double getArea() {
        return a*a;
    }
    public double getPerimeter() {
        return a*4;
    }
}
