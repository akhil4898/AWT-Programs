import java.awt.*;
import java.awt.event.*;

class AddAwt extends WindowAdapter implements ActionListener {
    Label num1, num2, result;
    TextField textnum1, textnum2, textresult;
    Button add1, sub, mul, div;
    Frame f;

    AddAwt() {
        f = new Frame("Calculator");
        f.setLayout(null);
        num1 = new Label("Num 1");
        num2 = new Label("Num 2");
        result = new Label("Result");
        textnum1 = new TextField();
        textnum2 = new TextField();
        textresult = new TextField();
        add1 = new Button("ADD");
        sub = new Button("SUB");
        mul = new Button("MUL");
        div = new Button("DIV");
        f.setLayout(null);
        f.add(num1);
        f.add(num2);
        f.add(result);
        f.add(textnum1);
        f.add(textnum2);
        f.add(textresult);
        f.add(add1);
        f.add(sub);
        f.add(mul);
        f.add(div);
        textresult.setEditable(false);
        add1.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        f.setSize(300, 300);
        num1.setBounds(20, 40, 60, 30);
        textnum1.setBounds(100, 40, 100, 30);
        num2.setBounds(20, 80, 60, 30);
        textnum2.setBounds(100, 80, 100, 30);
        result.setBounds(20, 120, 60, 30);
        textresult.setBounds(100, 120, 100, 30);
        add1.setBounds(90, 160, 50, 30);
        sub.setBounds(150, 160, 50, 30);
        mul.setBounds(90, 200, 50, 30);
        div.setBounds(150, 200, 50, 30);
        f.addWindowListener(this);
        f.setVisible(true);
        f.setResizable(false);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int n1 = Integer.parseInt(textnum1.getText());      
            int n2 = Integer.parseInt(textnum2.getText());
            if (e.getSource() == add1) {
                String res = String.valueOf(n1 + n2);
                textresult.setText(res);
            }
            if (e.getSource() == sub) {
                String res = String.valueOf(n1 - n2);
                textresult.setText(res);
            }
            if (e.getSource() == mul) {
                String res = String.valueOf(n1 * n2);
                textresult.setText(res);
            }
            if (e.getSource() == div) {
                String res = String.valueOf((float) (n1 * 1.0) / n2);
                textresult.setText(res);
            }
        } catch (Exception ex) {
            textresult.setText("Invalid Input");
        }
    }

    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public static void main(String args[]) {
        new AddAwt();
    }
}