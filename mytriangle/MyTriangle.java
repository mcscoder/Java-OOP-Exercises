package mytriangle;

import mypoint.*;

// Done
public class MyTriangle {
    private MyPoint v1 = new MyPoint();
    private MyPoint v2 = new MyPoint();
    private MyPoint v3 = new MyPoint();

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1.setXY(x1, y1);
        v2.setXY(x2, y2);
        v3.setXY(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return String.format("MyTriangle[v1=%s,v2=%s,v3=%s]",
            v1.toString(), v2.toString(), v3.toString());
    }

    public double getPerimeter() {
        double e1 = v1.distance();
        double e2 = v2.distance();
        double e3 = v3.distance();
        return e1 + e2 + e3;
    }

    public String getType() {
        double e1 = v1.distance(v2);
        double e2 = v2.distance(v3);
        double e3 = v3.distance(v1);
        if (e1 == e2 && e2 == e3) {
            return "equilateral";
        } else if (e1 == e2 || e1 == e3 || e2 == e3) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}
