package mypolynomial;
// Done
public class MyPolynomial {
    private double[] coeffs;
    
    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public String toString() {
        String string = "";
        for(int n = coeffs.length - 1; n > 0; n--) {
            string += String.format("%sx^%s+", coeffs[n], n);
        }
        string += String.format("%s", coeffs[0]);
        return string;
    }

    public double evaluate(double x) {
        double sumOfExp = 0;
        for(int n = coeffs.length - 1; n >= 0; n--) {
            sumOfExp += coeffs[n] * Math.pow(x, n);
        }
        return sumOfExp;
    }

    public MyPolynomial add(MyPolynomial another) {
        if (coeffs.length < another.coeffs.length) {
            double[] temp = coeffs;
            coeffs = another.coeffs;
            another.coeffs = temp;
        }
        for(int i = 0; i < another.coeffs.length; i++) {
            coeffs[i] += another.coeffs[i];
        }
        return this;
    }

    public MyPolynomial multiply(MyPolynomial another) {
        if (coeffs.length < another.coeffs.length) {
            double[] temp = coeffs;
            coeffs = another.coeffs;
            another.coeffs = temp;
        }

        for(int i = 0; i < another.coeffs.length; i++) {
            coeffs[i] *= another.coeffs[i];
        }
        return this;
    }
}