import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator {
    public static void main(String[] args) {
        new Calci();
    }
}

class Calci implements ActionListener {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,
            minus,plus,mul,div,reset,ans;

    TextField txtfld;

    Calci(){

        Frame frame = new Frame("Calculator");

        txtfld = new TextField("Enter");
        txtfld.setBounds(50,60,170,30);

        btn1 = new Button("1");
        btn1.setBounds(50,100,20,20);
        btn1.addActionListener(this);

        btn2 = new Button("2");
        btn2.setBounds(90,100,20,20);
        btn2.addActionListener(this);

        btn3 = new Button("3");
        btn3.setBounds(130,100,20,20);
        btn3.addActionListener(this);


        plus= new Button("+");
        plus.setBounds(170,100,20,20);
        plus.addActionListener(this);

        btn4 = new Button("4");
        btn4.setBounds(50,150,20,20);
        btn4.addActionListener(this);

        btn5 = new Button("5");
        btn5.setBounds(90,150,20,20);
        btn5.addActionListener(this);


        btn6 = new Button("6");
        btn6.setBounds(130,150,20,20);
        btn6.addActionListener(this);

        minus= new Button("-");
        minus.setBounds(170,150,20,20);
        minus.addActionListener(this);


        btn7 = new Button("7");
        btn7.setBounds(50,200,20,20);
        btn7.addActionListener(this);


        btn8 = new Button("8");
        btn8.setBounds(90,200,20,20);
        btn8.addActionListener(this);


        btn9 = new Button("9");
        btn9.setBounds(130,200,20,20);
        btn9.addActionListener(this);

        mul= new Button("*");
        mul.setBounds(170,200,20,20);
        mul.addActionListener(this);


        reset = new Button("R");
        reset.setBounds(50,240,20,20);
        reset.addActionListener(this);


        btn0 = new Button("0");
        btn0.setBounds(90,240,20,20);
        btn0.addActionListener(this);


        ans = new Button("=");
        ans.setBounds(130,240,20,20);
        ans.addActionListener(this);

        div= new Button("/");
        div.setBounds(170,240,20,20);
        div.addActionListener(this);

        frame.add(txtfld);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(plus);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(minus);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(mul);
        frame.add(reset);
        frame.add(btn0);
        frame.add(ans);
        frame.add(div);


        frame.setSize(1000,1000);
        frame.setLayout(null);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btn0){
           String exp  =  txtfld.getText();
           exp+="0";
           txtfld.setText(exp);
        }
        if(e.getSource()== btn1){
            String exp  =  txtfld.getText();
            exp+="1";
            txtfld.setText(exp);
        }
        if(e.getSource()== btn2){
            String exp  =  txtfld.getText();
            exp+="2";
            txtfld.setText(exp);
        }
        if(e.getSource()== btn3){
            String exp  =  txtfld.getText();
            exp+="3";
            txtfld.setText(exp);
        }
        if(e.getSource()== btn4){
            String exp  =  txtfld.getText();
            exp+="4";
            txtfld.setText(exp);
        }
        if(e.getSource()== btn5){
            String exp  =  txtfld.getText();
            exp+="5";
            txtfld.setText(exp);
        }
        if(e.getSource()== btn6){
            String exp  =  txtfld.getText();
            exp+="6";
            txtfld.setText(exp);
        }
        if(e.getSource()== btn7){
            String exp  =  txtfld.getText();
            exp+="7";
            txtfld.setText(exp);
        }
        if(e.getSource()== btn8){
            String exp  =  txtfld.getText();
            exp+="8";
            txtfld.setText(exp);
        }
        if(e.getSource()== btn9){
            String exp  =  txtfld.getText();
            exp+="9";
            txtfld.setText(exp);
        }

        if(e.getSource()== plus){
            String exp  =  txtfld.getText();
            exp+="+";
            txtfld.setText(exp);
        }

        if(e.getSource()== minus){
            String exp  =  txtfld.getText();
            exp+="-";
            txtfld.setText(exp);
        }

        if(e.getSource()== mul){
            String exp  =  txtfld.getText();
            exp+="*";
            txtfld.setText(exp);
        }

        if(e.getSource()== div){
            String exp  =  txtfld.getText();
            exp+="/";
            txtfld.setText(exp);
        }

        if(e.getSource()==reset){
            String exp = "0";
            txtfld.setText(exp);
        }

        if(e.getSource()== ans){
            int a,b;
            char operator='+';
            int i;

            String exp = txtfld.getText();
            String tempA="";
            String tempB="";

            for(i=0;i<exp.length();i++){
               if(Character.isDigit(exp.charAt(i))){
                   tempA += exp.charAt(i);
               }
               else{
                   operator=exp.charAt(i);
                   break;
               }

            }

            tempB=exp.substring(i+1);

            a=Integer.parseInt(tempA);
            b=Integer.parseInt(tempB);
            int result =0;

            switch(operator){

                case '+':
                    result = a+b;
                    break;

                case '-':
                    result = a-b;
                    break;

                case '*':
                    result = a *b;
                    break;

                case '/':
                    result = a/b;
                    break;


            }

            txtfld.setText(String.valueOf(result));
            System.out.println(txtfld);

        }



    }
}
