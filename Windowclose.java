import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Windowclose {
    public static void main(String[] args) {
        new wc();
    }
}


class wc {

    wc() {
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
        frame.setSize(500, 500);
        frame.setVisible(true);

    }

}