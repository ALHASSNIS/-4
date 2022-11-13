import java.awt.*;

/**
 * Created by H on 11/11/2022.
 */
public class h4_4 {
    public static void main(String[] args) {
        Rectangle box=new Rectangle(5,10,20,30);
        System.out.println(box);
        box.add(0,0);
        System.out.println("x=0,y=0,width=20,30");
        System.out.println(box);
    }
}
