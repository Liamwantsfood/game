import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;

public class Ball {
    private int x,y,size,xSpeed,ySpeed;
    public Color color;
    public Ball(int x,int y,int size,int xSpeed,int ySpeed) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
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
