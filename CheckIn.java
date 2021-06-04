import javax.swing.*;

/**
 * CheckIn has the Main method and it can create GUi.
 * @author Mingze Wu
 * @version 1.0.0
 */
public class CheckIn {
    private static void createGUI(){
        MyFrame frame = new MyFrame("WorkShop Check In");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("WorkShop Check In");
        frame.setSize(600,800);
        frame.setVisible(true);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createGUI();
            }
        });
    }

}
