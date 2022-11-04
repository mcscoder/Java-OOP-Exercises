package myline;

public class MyLineMain {
    public static void main(String[] args) {
        MyLine line = new MyLine(1, 2, 4, 5);
        System.out.println(line);
        System.out.println(line.getLength());
        System.out.println(line.getGradient());
    }
}
