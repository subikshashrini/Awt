import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Simple {
    Simple(){
        Frame frame = new Frame("Form");

        Label mail = new Label("Enter your Name");
        mail.setBounds(50,130,150,50);
        TextField mailinput = new TextField();
        mailinput.setBounds(200,135,200,30);

        Label password = new Label("Password");
        password.setBounds(50,170,150,50);
        TextField passinput = new TextField();
        passinput.setBounds(200,175,200,30);


        Label age = new Label("Enter your Age");
        age.setBounds(50,210,150,50);
        TextField ageinput = new TextField();
        ageinput.setBounds(200,215,200,30);

        Button submit = new Button("Submit");

        submit.setBounds(220,260,60,40);

        ActionListener sublister = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //action event e in that e our event will be stored
                System.out.println(mailinput.getText());
                System.out.println(passinput.getText());
                System.out.println(ageinput.getText());

            }
        };

        submit.addActionListener(sublister);//checks whther we gonna press or not.
        frame.add(mail);
        frame.add(password);
        frame.add(age);
        frame.add(mailinput);
        frame.add(ageinput);
        frame.add(passinput);
        frame.add(submit);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500,500);
    }



}

class Main{
    public static void main(String[] args){
        new Simple();
    }
}
