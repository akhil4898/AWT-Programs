import java.awt.*;

import javax.swing.JFrame;

class First2 {
    public static void main(String[] args) {
        JFrame f1 = new JFrame("Checkbox");
        // Label l1 =new Label("Please choose one of the following :");
        Checkbox c1 = new Checkbox("C");
        Checkbox c2 = new Checkbox("C++");
        Checkbox c3 = new Checkbox("java");
        Checkbox c4 = new Checkbox("python");
        Checkbox c5 = new Checkbox("javascript");
        Checkbox c6 = new Checkbox("React Native ");
        Label l1 = new Label("Please choose one of the following: ");
        f1.setLayout(null);
        l1.setBounds(20, 40, 500, 20);
        c1.setBounds(20, 60, 100, 20);
        c2.setBounds(20, 80, 100, 20);
        c3.setBounds(20, 100, 100, 20);
        c4.setBounds(20, 120, 100, 20);
        c5.setBounds(20, 140, 100, 20);
        c6.setBounds(20, 160, 100, 20);
        f1.add(l1);
        f1.add(c1);
        f1.add(c2);
        f1.add(c3);
        f1.add(c4);
        f1.add(c5);
        f1.add(c6);
        // Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // int height = screenSize.height;
        // int width = screenSize.width;
        f1.setSize(600, 600);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // System.out.println("hello");
    }
}