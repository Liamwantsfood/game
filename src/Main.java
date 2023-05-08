import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
    frame.setResizable(false);
    frame.setSize(500,500);
    Panel gamePanel = new Panel();
    frame.setVisible(true);
    frame.add(gamePanel);


    }
}