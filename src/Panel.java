import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Panel extends JPanel{
    ArrayList<Ball> balls = new ArrayList<Ball>();
    public Panel () {
        balls.add(new Ball(10,10,20,10,10));
    }





    @Override
    protected void paintComponent(Graphics g) {
super.paintComponent(g);

        for (int i = 0; i < balls.size(); i++) {
            balls.get(i).drawBall(g);
            balls.get(i).moveBall(this);
        }

        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println(e);
        }
        repaint();
    }
}
