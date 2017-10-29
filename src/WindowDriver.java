import javax.swing.*;

public class WindowDriver {
    public static void main(String[] args) {

        MyJFrameWindow jfw = new MyJFrameWindow();
        jfw.setVisible(true);




        JOptionPane.showMessageDialog(null,"Closing the window");
        System.exit(0);
    }

}
