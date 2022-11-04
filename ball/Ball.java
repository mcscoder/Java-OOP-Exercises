package ball;

public class Ball {
    private double x, y, xDelta, yDelta;
    private int radius;

    public Ball(double x, double y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        // direction must be convert from degree to radians
        this.xDelta = speed * Math.cos(direction * Math.PI / 180);
        this.yDelta = -speed * Math.sin(direction * Math.PI / 180);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getXDelta() {
        return xDelta;
    }

    public void setXDelta(double xDelta) {
        this.xDelta = xDelta;
    }

    public double getYDelta() {
        return yDelta;
    }

    public void setYDelta(double yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    public String toString() {
        return String.format("Ball[(%s,%s),speed=(%s,%s)]", x, y, xDelta, yDelta);
    }
}