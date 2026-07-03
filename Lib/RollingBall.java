package Lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RollingBall extends JPanel implements ActionListener {
    int x = 100;
    int angle = 0;

    public RollingBall() {
        Timer t = new Timer(50, this);
        t.start();
    }

    public void paintComponent(Graphics g) {
        g.drawOval(x, 90, 80, 80);
        g.fillArc(x, 90, 80, 80, angle, 180);
    }

    public void actionPerformed(ActionEvent e) {
        x -= 2;
        angle = (angle - 5) % 360;
        if (x < -80) {
            x = getWidth();
        }
        repaint();
    }
}
