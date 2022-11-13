import javax.swing.*;
import java.awt.*;

/**
 * Created by H on 13/11/2022.
 */
public class h4_8 extends JFrame {
    public h4_8(){

        setBounds(100,100,200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(40,40,120,80);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Courier",Font.BOLD,14));
        g.drawString("SUAD",60,80);

       // g.drawRect(80,40,40,40);

    }

    public static void main(String[] args) {
        new h4_8();
    }
}
