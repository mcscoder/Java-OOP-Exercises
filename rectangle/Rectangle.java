package rectangle;
// Done
public class Rectangle {
    private double length = 1;
    private double width = 1;

    public Rectangle() {}
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getArea(double length, double width) {
        return length * width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }

    public double getPerimeter(double length, double width) {
        return (length  + width) * 2;
    }

    public String toString() {
        return String.format("Rectangle[length=%s,width=%s]", length, width);
    }
}
