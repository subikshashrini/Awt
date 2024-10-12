import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseAction {
    public static void main(String[] args) {
        new mouseact();
    }
}

class mouseact{
    mouseact(){

        Frame frame = new Frame("mouse listener");

        Label status = new Label("this is mouse");

        frame.add(status);
        frame.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e) {
                status.setText("mouse clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                status.setText("mouse pressed");

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                status.setText("mouse released");

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                status.setText("mouse entered");

            }

            @Override
            public void mouseExited(MouseEvent e) {
                status.setText("mouse exited");

            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
