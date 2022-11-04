package mypolynomial;

public class MyPolynomialMain {
    public static void main(String[] args) {
        MyPolynomial polynomial = new MyPolynomial(1.1, 2.2, 3.3);
        System.out.println(polynomial);
        System.out.println(polynomial.evaluate(3));
        System.out.println(polynomial.add(new MyPolynomial(-0.1, -0.2, -0.3)));
        System.out.println(polynomial.multiply(new MyPolynomial(2, 3, 1, 4)));
    }
}
