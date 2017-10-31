import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;

public class ButtonChaser extends JFrame implements ActionListener{
    JButton press = new JButton("Press Me");
    private int btn_width = 100;
    private int btn_height = 100;

public ButtonChaser()
{
  setTitle("The Button Chaser Application");
 setSize(275,170);
setLocation(550,300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cPane = getContentPane();
    cPane.setLayout(new FlowLayout());

    JPanel button = new JPanel();
    button.setLayout(null);
    button.setLocation(0,0);

press.setSize(30,15);
press.setMnemonic('P');
button.add(press);
add(press);

press.addActionListener(this);

}

    public void actionPerformed(ActionEvent e) {
        Random ran = new Random();
     press.setBounds(ran.nextInt(getContentPane().getWidth() - btn_width),
      ran.nextInt(getContentPane().getHeight() - btn_height),
              btn_width,btn_height);
    }

    public static void main(String[] args)
    {
        ButtonChaser btnChaser = new ButtonChaser();
        btnChaser.setVisible(true);
    }

}
