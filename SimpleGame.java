import java.awt.*;
import java.awt.event.*;

public class SimpleGame extends Frame implements MouseMotionListener {

    int CircleX=200,CircleY=200,Circleradius =20;

   SimpleGame(){
       addMouseMotionListener(this);
       addWindowListener(new WindowAdapter()
       {


           @Override
           public void windowClosing(WindowEvent e)
           {
            System.exit(0);
           }


       });
       setSize(400,400);
       setLayout(null);
       setTitle("Ball Game");
       setVisible(true);
   }

   public void paint(Graphics g){
       super.paint(g);
       g.setColor(Color.BLUE);
       g.fillOval(CircleX,CircleY,2*Circleradius,2*Circleradius);


   }
    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
       int x = e.getX();
       int y = e.getY();

       if(x<CircleX+Circleradius){
           CircleX++;
       }
        if(x>CircleX+Circleradius){
            CircleX--;
        }

        if(y> CircleY+Circleradius){
            CircleY++;
        }

        if(y< CircleY+Circleradius){
            CircleY--;
        }
        repaint();

    }

    public static void main(String[] args) {
        new SimpleGame();
    }
}
