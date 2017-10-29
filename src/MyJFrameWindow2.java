import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyJFrameWindow2 extends JFrame{

public MyJFrameWindow2() //Constructor
{
   Container cPane = getContentPane();
   cPane.setLayout(new FlowLayout());

   setTitle("My own JFrame Application");
   setSize(300,200);
setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

/*Setting up window listeners for closing, minimizing and maximising the
* window by using the event handlers as anonymous inner classes within the
* constructor class.*/
    addWindowListener(new WindowAdapter() {
        @Override
        //Closing the window by choosing to keep the app opened or close the window
        //and terminate the program
        public void windowClosing(WindowEvent e) {
            int dialogRes = JOptionPane.showConfirmDialog(null,"Do you want to terminate this application","Window Confirmation",JOptionPane.YES_NO_OPTION);
            if(dialogRes == JOptionPane.YES_OPTION)
            {
                JOptionPane.showMessageDialog(null,"This application will shut down","Shutdown",JOptionPane.INFORMATION_MESSAGE);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                System.exit(0);
            }
            else {
                setVisible(true);
            }

        }
    });

    addWindowListener(new WindowAdapter() {
        @Override
        public void windowIconified (WindowEvent e){
            JOptionPane.showMessageDialog(null, "Minimizing the window", "Minimizing", JOptionPane.INFORMATION_MESSAGE);
            setExtendedState(Frame.ICONIFIED);
        }
    });

    addWindowListener(new WindowAdapter() {
        @Override
        public void windowDeiconified(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Restoring the window", "Restoration", JOptionPane.INFORMATION_MESSAGE);
            setExtendedState(Frame.NORMAL);
        }
    });


}//End of Constructor

    public static void main(String[] args) {
     MyJFrameWindow2 jfw = new MyJFrameWindow2();
      jfw.setVisible(true);
    }

}
