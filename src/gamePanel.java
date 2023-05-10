import javax.swing.*;
import java.awt.*;
import java.util.*;

public class gamePanel extends JPanel{
    ArrayList<Ball> balls = new ArrayList<Ball>();
    public gamePanel () {



    }
// (int)(Math.random()*50)+10


    public void spawn() {
        while (true) {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
       // balls.add(new Ball((int)(Math.random()*480)+10,(int)(Math.random()*480)+10,(int)(Math.random()*50)+10,2,2));
    }
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

        // balls.add(new Ball((int)(Math.random()*480)+10,(int)(Math.random()*480)+10,(int)(Math.random()*50)+10,2,2));

        repaint();
    }
}
