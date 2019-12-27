import java.awt.*;
class First{
    public static void main(String[] args) {
        Frame f = new Frame("Button");
        Button b1 = new Button("Submit");
        f.setLayout(null);
        b1.setBounds(500, 500, 60, 20);
        f.add(b1);
        f.setVisible(true);
    }

}
