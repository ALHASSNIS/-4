import com.sun.corba.se.impl.corba.NamedValueImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
 * Created by H on 11/11/2022.
 */

public class h4_7 {

    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setSize(400,400);
        JLabel label=new JLabel("suad");
        label.isFontSet();
        label.setOpaque(true);
        label.setBackground(Color.green);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }

}
