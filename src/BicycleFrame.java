import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.*;

public class BicycleFrame extends JFrame{

public BicycleFrame()
{
    Container cPane = getContentPane();
    cPane.setLayout(new FlowLayout());

 setSize(550,300);
setLocation(100,200);
setTitle("Bicycle Shop");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//13

    JButton smile = new JButton(new ImageIcon("C:\\Users\\Jack\\Pictures\\Happy Face.png"));
    JButton frown = new JButton(new ImageIcon("C:\\Users\\Jack\\Pictures\\Sad Face.png"));

    smile.setSize(20,20);


  setLayout(new FlowLayout());
    add(smile);
    add(frown);


    smile.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"You pressed a happy face","Happy",JOptionPane.INFORMATION_MESSAGE);
        }
    });

    frown.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"You pressed a sad face","Sad",JOptionPane.INFORMATION_MESSAGE);
        }
    });

}



    public static void main(String[] args) {

        BicycleFrame bf = new BicycleFrame();
        bf.setVisible(true);

    }

}
