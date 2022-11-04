package ballgame;

public class Player {
    // private int number;
    private double x, y, z;

    public Player(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
    }

    public void jump(double zDisp) {
        z += zDisp;
    }

    // closest distance from ball to player
    public boolean near(Ball ball) {
        double x = ball.getX() - this.x;
        double y = ball.getY() - this.y;
        double z = ball.getZ() - this.z;
        double distance = Math.sqrt(x*x + y*y + z*z);
        if (distance < 8) return true;
        return false;
    }

    public void kick(Ball ball) {
        if (near(ball)) {
            ball.setXYZ(ball.getX() + 1, ball.getY(), ball.getZ());
            return;
        }
        System.out.println("too far, can't kick");
    }
}
