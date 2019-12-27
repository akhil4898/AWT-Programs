import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DrawCircle extends WindowAdapter implements MouseListener {
    Frame f;

    DrawCircle() {
        f = new JFrame("Draw Circle");
        f.setLayout(null);
        f.addMouseListener(this);
        f.setSize(300, 300);
        f.addWindowListener(this);
        f.setVisible(true);
        f.setResizable(false);
    }

    public void mouseClicked(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.blue);
        int a = e.getX();
        int b  = e.getY();
        g.fillOval(a, b, 30, 30);
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public static void main(String args[]) {
        new DrawCircle();
    }
}