import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Created by H on 13/11/2022.
 */
public class h4_9 extends JFrame{

//    protected void pC(Graphics g){
//        Graphics2D g2=(Graphics2D)g;
//        Rectangle b=new Rectangle(100,100,100,250);
//        g2.fill(b);
//        Ellipse2D.Double r=new Ellipse2D.Double(120,140,50,50);
//        g2.setColor(Color.red);
//        g2.fill(r);
//
//
//
//
//    }

    public h4_9(){
setBounds(100,100,200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint(Graphics g){
        g.fillRect(80,40,60,150);

        g.setColor(Color.RED);
        g.fillOval(90,60,40,40);
        g.setColor(Color.BLACK);

        g.setColor(Color.GREEN);
        g.fillOval(90,100,40,40);
        g.setColor(Color.BLACK);
//        g.drawRect(80,80,40,40);
        g.setColor(Color.YELLOW);
        g.fillOval(90,140,40,40);
        g.setColor(Color.BLACK);


//        g.drawRect(80,120,40,40);
    }

    public static void main(String[] args) {
        new h4_9();
    }
}
