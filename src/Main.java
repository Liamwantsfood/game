import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        gamePanel myPanel = new gamePanel();
        frame.setResizable(false);

    frame.setSize(500,500);
    frame.add(myPanel);
        frame.setVisible(true);
        myPanel.spawn();



    }
}