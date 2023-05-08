import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel{
    public Panel () {

    }





    @Override
    protected void paintComponent(Graphics g) {
super.paintComponent(g);


        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println(e);
        }
        repaint();
    }
}
