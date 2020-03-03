package pkg;

import javax.swing.*;
import java.awt.*;

public class Logic extends JComponent {
    public void paint(Graphics g) {
        g.fillRect(10,10,200,200);
      
    }
    public void init() {
        JFrame frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.getContentPane().add(new Logic());
        frame.setVisible(true);
    }
}
