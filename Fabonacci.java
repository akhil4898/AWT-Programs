import java.awt.*;
import java.awt.event.*;

import sun.tools.jar.resources.jar;

class Fabonacci implements ActionListener {
    int n1, n2, n3;
    Label l1, l2;
    TextField t1, t2;
    Button b1;
    Frame f1;

    Fabonacci() {
        l1 = new Label("Enter a Integer number");
        l2 = new Label("Result");
        t1 = new TextField();
        t2 = new TextField();
        b1 = new Button("Fabonacci");
        f1 = new Frame("Calculate Fabonacci");
        f1.setLayout(null);
        f1.setSize(600, 600);
        l1.setBounds(50, 40, 200, 20);
        l2.setBounds(50, 80, 200, 20);
        t1.setBounds(300, 40, 200, 20);
        t2.setBounds(300, 80, 200, 20);
        b1.setBounds(150, 160, 200, 20);
        f1.add(l1);
        f1.add(l2);
        f1.add(t1);
        f1.add(t2);
        f1.add(b1);
        b1.addActionListener(this);
        f1.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = t1.getText();
        int a = Integer.parseInt(s1);
        if (e.getSource() == b1) {
            n1 = 0;
            n2 = 1;
            for (int i = 2; i <= a; i++) {
                n3 = n1 + n2;
                System.out.println(n3);
                n1 = n2;
                n2 = n3;
            }
            String s2 = String.valueOf(n3);
            t2.setText(s2);

        }
    }

    public static void main(String args[]) {
        new Fabonacci();
    }
}