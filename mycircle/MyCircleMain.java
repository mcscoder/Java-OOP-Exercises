package mycircle;

public class MyCircleMain {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(2, 3, 4);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getCirCumference());
        
        MyCircle c2 = new MyCircle(7, 8, 2);
        System.out.println(c1.distance(c2));
    }
}
