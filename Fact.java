import java.awt.*;
import java.awt.event.*;
class Fact implements ActionListener{
    int c;
    Label l1, l2, l3;
    TextField t1, t2,t3;
    Button b1;
    Frame f1;
    Fact(){
        l1 = new Label("First no.");
        l2 = new Label("Second no.");
        l3 = new Label("Result");
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        b1 = new Button("Add");
        f1 = new Frame("Calculate Factorial");
        f1.setLayout(null);
        f1.setSize(600,600);
        l1.setBounds(50, 40, 200, 20);
        l2.setBounds(50, 80, 200, 20);
        l3.setBounds(50, 120, 200, 20);
        t1.setBounds(300, 40, 200, 20);
        t2.setBounds(300, 80, 200, 20);
        t3.setBounds(300, 120, 200, 20);
        b1.setBounds(150, 160, 200, 20);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(t1);
        f1.add(t2);
        f1.add(t3);
        f1.add(b1);
        b1.addActionListener(this);
        f1.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        String s1 = t1.getText();
        String s2 = t2.getText();
        int a = Integer.parseInt(s1);        
        int b = Integer.parseInt(s2);
        if(e.getSource() == b1){
            c = a + b;
        }
        String s3 = String.valueOf(c);
        t3.setText(s3);
    }


    public static void main(String args[]){
        new Fact(); 
    }
}