package ball;

class BallMain {
    public static void main(String[] args) {
        Ball ball = new Ball(1, 2, 3, 4, 5);
        System.out.println(ball);
        System.out.println(ball.getX());
        System.out.println(ball.getY());
        System.out.println(ball.getRadius());
        System.out.println(ball.getXDelta());
        System.out.println(ball.getYDelta());

        
    }
}