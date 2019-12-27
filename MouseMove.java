import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseMove extends WindowAdapter implements MouseListener {
    Frame f;
    JLabel label, mousemove;
    JButton ok;

    MouseMove() {
        f = new JFrame("Mouse Event");
        f.setLayout(null);
        label = new JLabel("Mouse Events");
        mousemove = new JLabel();
        ok = new JButton("BUTTON");
        f.add(label);
        f.add(ok);
        f.add(mousemove);
        ok.addMouseListener(this);
        f.setSize(300, 200);
        label.setBounds(100, 20, 100, 30);
        ok.setBounds(100, 70, 100, 30);
        mousemove.setBounds(100, 110, 100, 30);
        f.addWindowListener(this);
        f.setVisible(true);
        f.setResizable(false);
    }

    public void mouseClicked(MouseEvent e) {
        mousemove.setText("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        mousemove.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        mousemove.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        mousemove.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        mousemove.setText("Mouse Released");
    }

    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public static void main(String args[]) {
        new MouseMove();
    }
}