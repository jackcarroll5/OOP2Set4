import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class MyJFrameWindow extends JFrame{

public MyJFrameWindow()
{
    Container cPane = getContentPane();
    cPane.setLayout(new FlowLayout());

   setTitle("My own JFrame Application");
   setSize(300,200);
   addWindowListener(new WindowEventHandler());
    addWindowListener(new WindowEventHandler2());
    addWindowListener(new WindowEventHandler3());
   setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
}

    // specify the window-closing behaviour using an adapter class
private class WindowEventHandler extends WindowAdapter{
    public void windowClosing(WindowEvent e)
    {
   int dialogRes = JOptionPane.showConfirmDialog(null,"Do you want to terminate this application","Window Confirmation",JOptionPane.YES_NO_OPTION);
    if(dialogRes == JOptionPane.YES_OPTION)
    {
      JOptionPane.showMessageDialog(null,"This application will shut down","Shutdown",JOptionPane.INFORMATION_MESSAGE);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    else {
        setVisible(true);
    }

    }
}

    //Behaviour of minimizing the window using adapter class
    private class WindowEventHandler2 extends WindowAdapter{
        public void windowIconified(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Minimizing the window", "Minimizing", JOptionPane.INFORMATION_MESSAGE);
            setExtendedState(Frame.ICONIFIED);


        }
    }
    //Behaviour of maximising the window using adapter class
    private class WindowEventHandler3 extends WindowAdapter {
        public void windowDeiconified(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Restoring the window", "Restoration", JOptionPane.INFORMATION_MESSAGE);
            setExtendedState(Frame.NORMAL);

        }
    }


    public static void main(String[] args) {
     MyJFrameWindow jfw = new MyJFrameWindow();
      jfw.setVisible(true);

    }

}
