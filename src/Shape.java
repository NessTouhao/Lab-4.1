public abstract class Shape {
    public abstract String getType();
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString() {
        return getType() + ": S = " + getArea() + " P = " + getPerimeter();
    }
}
