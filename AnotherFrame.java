import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;


/**
 * Another frame create the GUI of the second part.
 *
 * @author Mingze wu
 * @version 1.0
 */
public class AnotherFrame extends JFrame {

    /**
     * Instantiates a new Another frame.
     *
     * @param arr the array from MyFrame
     */
    public AnotherFrame(String[] arr){
        JPanel headTitlePanel = new JPanel();
        JLabel headTitle = new JLabel();
        JPanel buttonPanel = new JPanel();
        JButton finishButton = new JButton();
        JPanel textPanel = new JPanel();
        JTextArea textArea = new JTextArea();

        //JLabel
        headTitle.setText("You have checked in successfully");



        //setting LayoutManager
        Container content = getContentPane();
        content.setLayout(new BorderLayout());


        //headTitle
        headTitle.setText("You have checked in successfully.");
        headTitle.setHorizontalAlignment(SwingConstants.CENTER);
        headTitle.setFont(headTitle.getFont().deriveFont(headTitle.getFont().getStyle() | Font.BOLD, headTitle.getFont().getSize() + 4f));
        headTitle.setForeground(Color.black);

        headTitlePanel.add(headTitle);

        //textArea
        textPanel.setBorder(BorderFactory.createLoweredBevelBorder());

        textArea.setText("Full name: " + arr[0]+ " " + arr[1] +"\n" +
                "Data of birth: " + arr[2] + " " + arr[3] + "\n"+
                "Programme: " + arr[4] +  ", Year " + arr[5] +"\n"+
                "Email: " + arr[6] + "\n"+
                "Phone number: " + arr[7]);
        textArea.setLineWrap(true);
        textArea.setSize(480,200);
        textArea.setEditable(false);
        textArea.setRows(6);
        textArea.setBackground(new Color(238,238,238));

        textPanel.add(textArea);

        //button
        finishButton.setText("Finished");
        finishButton.setBackground(Color.WHITE);


        finishButton.addActionListener(e -> System.exit(0));


        buttonPanel.add(finishButton);
        buttonPanel.setBorder(BorderFactory.createLoweredBevelBorder());


        //adding component
        content.add(BorderLayout.NORTH,headTitlePanel);
        content.add(BorderLayout.CENTER,textPanel);
        content.add(BorderLayout.SOUTH,buttonPanel);
    }
}
