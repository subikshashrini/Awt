import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Windowclosing {
    public static void main(String[] args) {
        new windowc();

    }

}

    class windowc implements WindowListener {

        windowc()
        {
            Frame frame = new Frame();
            Button btn = new Button();

            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                   System.exit(0);
                }
            });

            frame.add(btn);

            frame.setLayout(new FlowLayout());
            frame.setSize(500,500);
            frame.setVisible(true);

        }

        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);

        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {

        }

        @Override
        public void windowDeiconified(WindowEvent e) {

        }

        @Override
        public void windowActivated(WindowEvent e) {

        }

        @Override
        public void windowDeactivated(WindowEvent e) {

        }
    }

