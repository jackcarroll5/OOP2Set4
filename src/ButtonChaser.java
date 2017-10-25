import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.event.*;
import java.awt.*;

public class ButtonChaser extends JFrame {

public ButtonChaser()
{
  setTitle("The Button Chaser Application");
 setSize(275,170);
setLocation(550,300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JButton press = new JButton("Press Me");
press.setMnemonic('P');
add(press);



}


    public static void main(String[] args)
    {
        ButtonChaser btnChaser = new ButtonChaser();
        btnChaser.setVisible(true);
    }



}
