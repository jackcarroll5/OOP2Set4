import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class MyJFrameWindow extends JFrame{

public MyJFrameWindow()
{
   setTitle("My own JFrame Application");
   setSize(300,200);
   addWindowListener(new WindowEventHandler());
}

    // specify the window-closing behaviour using an adapter class
private class WindowEventHandler extends WindowAdapter{
    public void windowClosing(WindowEvent e)
    {
   int dialogRes = JOptionPane.showConfirmDialog(null,"Do you want to terminate this application","Window Confirmation",JOptionPane.YES_NO_OPTION);
    if(dialogRes == JOptionPane.YES_OPTION)
    {
      JOptionPane.showMessageDialog(null,"This application will shut down","Shutdown",JOptionPane.INFORMATION_MESSAGE);
       setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

        setExtendedState(Frame.ICONIFIED);
        JOptionPane.showMessageDialog(null,"Minimising the window","Minimizing",JOptionPane.INFORMATION_MESSAGE);

         setExtendedState(Frame.NORMAL);
        JOptionPane.showMessageDialog(null,"Restoring the window","Restoration",JOptionPane.INFORMATION_MESSAGE);

    }
}


    public static void main(String[] args) {
     MyJFrameWindow jfw = new MyJFrameWindow();
      jfw.setVisible(true);

    }

}
