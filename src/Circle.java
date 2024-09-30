public class Circle extends Shape{
    private double r;
    public Circle(double r) {
        this.r=r;
    }
    public String getType() {
        return "Circle";
    }
    public double getArea() {
        return Math.PI*r*r;
    }
    public double getPerimeter() {
        return Math.PI*r*2;
    }
    public String toString() {
        return super.toString();
    }
}

