import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class counter {
    public static void main(String[] args){
        new count();
    }
}

class count{

    count(){
        Frame frm = new Frame("Counter");

        Button btn = new Button("Click me here");
        btn.setBounds(70,100,100,30);

        Label lbl = new Label("count:0");
        lbl.setBounds(150,50,100,30);

        int[] count={0};

        Button reset = new Button("Reset");
        reset.setBounds(200,100,100,30);

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count[0]=0;
                lbl.setText("count"+count[0]);
            }
        });

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count[0]++;
                lbl.setText("count"+count[0]);
            }
        });

        frm.add(btn);
        frm.add(lbl);
        frm.add(reset);

        frm.setSize(500,500);
        frm.setLayout(null);
        frm.setVisible(true);





    }
}