package mytriangle;

public class MyTriangleMain {
    public static void main(String[] args) {
        MyTriangle triangle = new MyTriangle(1, 1, 2, 2, 3, 3);

        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getType());
    }
}
