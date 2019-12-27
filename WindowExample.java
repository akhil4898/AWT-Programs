import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowExample extends Frame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    WindowExample() {
        addWindowListener((WindowListener) new WindowAdapter() {
            public void windowClosing(final WindowEvent e) {
                dispose();
            }
        });
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(final String[] args) {
    new WindowExample();  
}
}