package ball;

public class Container {
    private int x1, y1, x2, y2;

    public Container(int x, int y, int width, int height) {
        x1 = x;
        y1 = y;
        x2 = x1 + width - 1;
        y2 = y1 + height - 1;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1 + 1;
    }

    public int getHeight() {
        return y2 - y1 + 1;
    }

    public boolean collidesWith(Ball ball) {
        if (ball.getX() - ball.getRadius() <= x1 ||
            ball.getX() - ball.getRadius() >= x2) {
            ball.reflectHorizontal();
            return true;
        }
        if (ball.getY() - ball.getRadius() <= y1 ||
            ball.getY() - ball.getRadius() >= x2) {
                ball.reflectVertical();
                return true;
        }
        return false;    
    }

    public String toString() {
        return String.format("Container[(%s,%s),(%s,%s)", 
                            x1, y1, x2, y2);
    }
}