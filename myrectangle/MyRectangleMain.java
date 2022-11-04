package myrectangle;

public class MyRectangleMain {
    public static void main(String[] args) {
        MyRectangle rec1 = new MyRectangle(1, 1, 3, 3);
        System.out.println(rec1);
        System.out.println(rec1.getPerimeter());
        System.out.println(rec1.getArea());
    }
}
