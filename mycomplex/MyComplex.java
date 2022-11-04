package mycomplex;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {}

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;   
    }

    public String toString() {
        return String.format("%s+%si", real, imag);
    }

    public boolean isReal() {
        return (imag == 0.0) ? true : false;
    }

    public boolean isImaginary() {
        return (real == 0.0) ? true : false;
    }

    public boolean equals(double real, double imag) {
        if (this.real != real) 
            return false;
        if (this.imag != imag) 
            return false;
        return true;
    }

    public boolean equals(MyComplex another) {
        if (real != another.getReal())
            return false;
        if (imag != another.getImag())
            return false;
        return true;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public MyComplex addInto(MyComplex right) {
        real += right.getReal();
        imag += right.getImag();
        return new MyComplex(real, imag);
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(real + right.getReal(), imag + right.getImag());
    }

    public double argument() {
        double radian = Math.PI / 180;
        return Math.atan2(imag * radian, real * radian);
    }

    public MyComplex subtract(MyComplex right) {
        real -= right.getReal();
        imag -= right.getImag();
        return new MyComplex(real, imag);
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(real - right.getReal(), imag - right.getImag());
    }

    public MyComplex multiply(MyComplex right) {
        double a = real, b = imag, c = right.getReal(), d = right.getImag();
        real = a*c - b*d;
        imag = a*d + b*c;
        return this;
}

    public MyComplex divide(MyComplex right) {
        double a = real, b = imag, c = right.getReal(), d = right.getImag();
        real = (a*c + b*d) / (c*c + d*d);
        imag = (b*c - a*d) / (c*c + d*d);
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }
}