import java.awt.*;
import java.awt.event.*;

class Courses extends WindowAdapter {
    Frame f;
    Label course;
    CheckboxGroup cbg;
    Checkbox bca, mca, mtech, btech;

    Courses() {
        f = new Frame("Courses");
        course = new Label("Courses");
        cbg = new CheckboxGroup();
        bca = new Checkbox("BCA", cbg, true);
        mca = new Checkbox("MCA", cbg, false);
        btech = new Checkbox("B-Tech", cbg, false);
        mtech = new Checkbox("M-Tech", cbg, false);
        f.add(course);
        f.add(bca);
        f.add(mca);
        f.add(btech);
        f.add(mtech);
        course.setBounds(20, 20, 100, 30);
        bca.setBounds(20, 60, 100, 30);
        mca.setBounds(20, 100, 100, 30);
        btech.setBounds(20, 140, 100, 30);
        mtech.setBounds(20, 180, 100, 30);
        f.setSize(300, 300);
        f.setLayout(null);
        f.addWindowListener(this);
        f.setVisible(true);
    }

    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public static void main(String args[]) {
        new Courses();
    }
}