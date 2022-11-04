package myrectangle;

import mypoint.*;

// Done
public class MyRectangle {
    private MyPoint topLeft = new MyPoint();
    private MyPoint botRight = new MyPoint();

    public MyRectangle(int x1, int y1, int x2, int y2) {
        topLeft.setXY(x1, y1);
        botRight.setXY(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint botRight) {
        this.topLeft = topLeft;
        this.botRight = botRight;
    }
    
    public String toString() {
        return String.format("MyRectangle=[topLeft=%s,botRight=%s]",
        topLeft.toString(), botRight.toString());
    }

    public double getPerimeter() {
        double height = Math.abs(topLeft.getY() - botRight.getY()) + 1;
        double width = Math.abs(topLeft.getX() - botRight.getX()) + 1;
        return (width + height) * 2;
    }

    public double getArea() {
        double height = Math.abs(topLeft.getY() - botRight.getY()) + 1;
        double width = Math.abs(topLeft.getX() - botRight.getX()) + 1;
        return height * width;
    }
}