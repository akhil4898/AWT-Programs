import java.awt.*;
import java.awt.event.*;

// import javax.swing.*;
class Factorial extends WindowAdapter implements ActionListener {
    int fact;
    Label l1, l2;
    TextField t1, t2;
    Button b1, b2;
    Frame f1;

    Factorial() {
        l1 = new Label("Enter a Integer number");
        l2 = new Label("Result");
        t1 = new TextField();
        t2 = new TextField();
        b1 = new Button("Factorial");
        b2 = new Button("Reset");
        f1 = new Frame("Calculate Factorial");
        f1.setLayout(null);
        f1.setSize(600, 600);
        l1.setBounds(50, 40, 200, 20);
        l2.setBounds(50, 80, 200, 20);
        t1.setBounds(300, 40, 200, 20);
        t2.setBounds(300, 80, 200, 20);
        b1.setBounds(80, 160, 200, 20);
        b2.setBounds(300, 160, 200, 20);
        f1.add(l1);
        f1.add(l2);
        f1.add(t1);
        f1.add(t2);
        f1.add(b1);
        f1.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f1.addWindowListener(this);
        f1.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = t1.getText();
        int a = Integer.parseInt(s1);
        if (e.getSource() == b1) {
            fact = 1;
            for (int i = 1; i <= a; i++) {
                fact = i * fact;
            }
        } else if (e.getSource() == b2) {
            t1.setText("");
        }
        String s2 = String.valueOf(fact);
        t2.setText(s2);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        f1.dispose();
    }

    public static void main(String args[]) {
        new Factorial();
    }
}