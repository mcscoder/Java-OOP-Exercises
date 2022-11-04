package mycomplex;

public class MyComplexMain {
    public static void main(String[] args) {
        MyComplex comp1 = new MyComplex(1, 2);
        System.out.println(comp1);
        System.out.println(comp1.magnitude());
        System.out.println(comp1.argument());
        System.out.println(comp1.conjugate());

        MyComplex comp2 = new MyComplex(1, 2);
        System.out.println(comp1.equals(comp2));
        System.out.println(comp1.addInto(comp2));
        System.out.println(comp1.subtract(comp2));
        System.out.println(comp1.multiply(comp2));
        System.out.println(comp1.divide(comp2));
    }
}
