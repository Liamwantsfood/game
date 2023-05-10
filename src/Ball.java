import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;

public class Ball {
    private int x,y,size,xSpeed,ySpeed;
    public Color color;
    public Ball() {
    }


    public void createBall() {
        int spawn = (int)(Math.random()*4)+1;
        if (spawn == 1) {

        } else if (spawn == 2) {

        } else if (spawn == 3) {

        } else {

        }
    }
    public void drawBall(Graphics g) {
        g.fillOval(x,y,size,size);
        g.setColor(color);
    }
    public void moveBall(JPanel liam) {

        x+= xSpeed;
        if (x >= 500-size || x <= 0) {
            xSpeed *= -1;
        }

        y+= ySpeed;
        if (y >= 500-size || y <= 0) {
            ySpeed *= -1;
        }
    }
}
