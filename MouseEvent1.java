import java.awt.*;
import java.awt.event.*;
    
class MouseEvent1 implements MouseListener {
    Frame f1;
    Label l1;

    MouseEvent1() {
        l1 = new Label();
        f1 = new Frame("MouseEvent");
        f1.setLayout(null);
        f1.setSize(500, 600);
        l1.setBounds(150, 150, 150, 200);
        f1.add(l1);
        l1.addMouseListener(this);
        f1.setVisible(true);

    }

    public void mouseClicked(MouseEvent event) {
        l1.setText("Mouse Clicked");
        Graphics g = f.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(event.getX(), event.getY(), 30, 30);

    }

    private Graphics getGraphics() {
        return null;
    }

    public void mouseReleased(MouseEvent event) {
        l1.setText("Mouse Released");

    }

    public void mouseExited(MouseEvent event) {
        l1.setText("Mouse Exited");

    }

    public void mouseEntered(MouseEvent event) {
        l1.setText("Mouse Entered");

    }

    public void mousePressed(MouseEvent event) {
        l1.setText("Mouse Pressed");

    }

    public static void main(String[] args) {
        new MouseEvent1();
    }
}