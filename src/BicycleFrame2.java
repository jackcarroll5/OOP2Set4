import javax.swing.*;
import java.awt.*;

public class BicycleFrame2 extends JFrame{

public BicycleFrame2()
{
    Container cPane = getContentPane();
    cPane.setLayout(new FlowLayout());

 setSize(400,200);
setLocation(100,200);
setTitle("Bicycle Shop");
JLabel test = new JLabel("This is a foreground text in colour.");
add(test);
test.setForeground(Color.RED);
//cPane.setBackground(Color.BLUE);
//cPane.setForeground(Color.getHSBColor(332,353,123));
    cPane.setBackground(Color.getHSBColor(332,353,123));

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}


 public static void main(String[] args) {

     BicycleFrame2 bf2 = new BicycleFrame2();
     bf2.setVisible(true);
 }

}
