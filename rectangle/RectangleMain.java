package rectangle;

public class RectangleMain {
    public static void main(String[] args) {
        // Test constructors and toString()
        // You need to append a 'f' or 'F' to a float literal
        Rectangle r1 = new Rectangle(1.2, 3.4);
        System.out.println(r1);  // toString()
        Rectangle r2 = new Rectangle();  // default constructor
        System.out.println(r2);

        // Test setters and getters
        r1.setLength(5.6);
        r1.setWidth(7.8);
        System.out.println(r1);  // toString()
        System.out.printf("length is %.1f\n", r1.getLength());
        System.out.printf("width is: %.1f\n", r1.getWidth());

        // Test getArea() and getPerimeter()
        System.out.printf("area is: %.2f\n", r1.getArea());
        System.out.printf("perimeter is: %.2f\n", r1.getPerimeter());
    }
}
