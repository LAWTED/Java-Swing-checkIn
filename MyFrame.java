import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.*;

/**
 * My Frame create the GUI of the Main part.
 *
 * @author Mingze WU
 * @version 1.0
 */
public class MyFrame extends JFrame implements ActionListener {
    /**
     * The Title label.
     */
    JLabel titleLabel = new JLabel("Please Complete the information below",JLabel.CENTER);
    /**
     * The Name panel.
     */
    JPanel namePanel = new JPanel();
    /**
     * The Null name panel 1.
     */
    JPanel nullNamePanel1 = new JPanel();
    /**
     * The Null name panel 2.
     */
    JPanel nullNamePanel2 = new JPanel();
    /**
     * The First name panel.
     */
    JPanel firstNamePanel = new JPanel();
    /**
     * The Sur name panel.
     */
    JPanel surNamePanel = new JPanel();

    /**
     * The Date panel.
     */
    JPanel datePanel = new JPanel();
    /**
     * The Null date panel 1.
     */
    JPanel nullDatePanel1 = new JPanel();
    /**
     * The Null date panel 2.
     */
    JPanel nullDatePanel2 = new JPanel();
    /**
     * The Month panel.
     */
    JPanel monthPanel = new JPanel();
    /**
     * The Year panel.
     */
    JPanel yearPanel = new JPanel();

    /**
     * The Programme panel.
     */
    JPanel programmePanel = new JPanel();
    /**
     * The Major programme panel.
     */
    JPanel majorProgrammePanel = new JPanel();
    /**
     * The Year programme panel.
     */
    JPanel yearProgrammePanel = new JPanel();

    /**
     * The Email panel.
     */
    JPanel emailPanel = new JPanel();
    /**
     * The Phone panel.
     */
    JPanel PhonePanel = new JPanel();
    /**
     * The Book panel.
     */
    JPanel bookPanel = new JPanel();
    /**
     * The Check panel.
     */
    JPanel checkPanel = new JPanel();
    /**
     * The Agree panel.
     */
    JPanel agreePanel = new JPanel();
    /**
     * The Confirm panel.
     */
    JPanel confirmPanel = new JPanel();
    /**
     * The Button panel.
     */
    JPanel buttonPanel = new JPanel();

    /**
     * The First name text field.
     */
    JTextField firstNameTextField = new JTextField(10);
    /**
     * The Sur name text field.
     */
    JTextField surNameTextField = new JTextField(10);
    /**
     * The Email text field.
     */
    JTextField emailTextField = new JTextField(30);
    /**
     * The Phone text field.
     */
    JTextField phoneTextField = new JTextField(30);
    /**
     * The Book text field.
     */
    JTextField bookTextField = new JTextField(6);

    /**
     * The Month combo box.
     */
    JComboBox<Object> monthComboBox = new JComboBox<>();
    /**
     * The Major combo box.
     */
    JComboBox<Object> majorComboBox = new JComboBox<>();
    /**
     * The Year combo box.
     */
    JComboBox<Object> yearComboBox = new JComboBox<>();
    /**
     * The Year programme combo box.
     */
    JComboBox<Object> yearProgrammeComboBox = new JComboBox<>();

    /**
     * The Agree check box.
     */
    JCheckBox agreeCheckBox = new JCheckBox("I have read and agree to the terms and conditions.");
    /**
     * The Confirm check box.
     */
    JCheckBox confirmCheckBox = new JCheckBox("I confirm that the information provided is correct.");

    /**
     * The Exit button.
     */
    JButton exitButton = new JButton("Exit");
    /**
     * The Clear button.
     */
    JButton clearButton = new JButton("Clear");
    /**
     * The Next step button.
     */
    JButton nextStepButton = new JButton(" Next step");

    /**
     * The Arr.
     */
    String[] arr = new String[9];
    /**
     * The Agree flag.
     */
    Boolean agreeFlag = false;
    /**
     * The Confirm flag.
     */
    Boolean confirmFlag = false;

    /**
     * Instantiates a new My frame.
     *
     * @param title the title
     */
    public  MyFrame (String title){
        super(title);
        Container content = getContentPane();
        content.setLayout(new GridLayout(9,1));
        /*
          Set all the blank to '' instead of null.
         */
        for(int i = 0; i < arr.length; i++){
            arr[i] = "";
        }
        content.add(titleLabel);
        titleLabel.setFont(new Font("Helvetica",Font.BOLD,18));


        /*
          namePanel
         */
        content.add(namePanel);
        Border b1 = BorderFactory.createEtchedBorder();
        Border b2 = BorderFactory.createLineBorder(Color.BLACK,2);
        Border b3 = BorderFactory.createEmptyBorder();
        Border b4 = BorderFactory.createLineBorder(Color.red);

        namePanel.setBorder(BorderFactory.createTitledBorder( b1 ,"Name"));

        /*
          namePanel->4panel
         */
        namePanel.setLayout(new GridLayout(0,4));
        namePanel.add(nullNamePanel1);
        namePanel.add(firstNamePanel);
        namePanel.add(surNamePanel);
        namePanel.add(nullNamePanel2);

        /*
          namePanel->4panel->firstNamePanel
         */
        firstNamePanel.setBorder(BorderFactory.createTitledBorder(b2,"First Name"));
        firstNamePanel.setBackground(Color.WHITE);
        firstNamePanel.add(firstNameTextField);
        firstNameTextField.setBorder(b3);
        firstNameTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                arr[0] = firstNameTextField.getText();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                arr[0] = firstNameTextField.getText();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                arr[0] = firstNameTextField.getText();
            }
        });

        /*
          namePanel->4panel->surNamePanel
         */
        surNamePanel.setBorder(BorderFactory.createTitledBorder(b2,"Surname"));
        surNamePanel.setBackground(Color.WHITE);
        surNamePanel.add(surNameTextField);
        surNameTextField.setBorder(b3);
        surNameTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                arr[1] = surNameTextField.getText();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                arr[1] = surNameTextField.getText();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                arr[1] = surNameTextField.getText();
            }
        });

        /*
          datePanel
         */
        content.add(datePanel);
        datePanel.setBorder(BorderFactory.createTitledBorder(b1,"Date of Birth"));

        /*
          datePanel->4panel
         */
        datePanel.setLayout(new GridLayout(0,4));
        datePanel.add(nullDatePanel1);
        datePanel.add(monthPanel);
        datePanel.add(yearPanel);
        datePanel.add(nullDatePanel2);

        /*
          datePanel->monthPanel->monthComboBox
         */
        monthPanel.setBorder(BorderFactory.createTitledBorder(b1,"Month"));
        monthPanel.add(monthComboBox);
        monthComboBox.setModel(new DefaultComboBoxModel<>(new String[]{
                " ",
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        }));
        monthComboBox.addItemListener(e -> arr[2] = (String) monthComboBox.getSelectedItem());

        /*
          namePanel->yearPanel->yearComboBox
         */
        yearPanel.setBorder(BorderFactory.createTitledBorder(b1,"Year"));
        yearPanel.add(yearComboBox);
        yearComboBox.setModel(new DefaultComboBoxModel<>(new String[]{
                " ",
                "1998",
                "1999",
                "2000",
                "2001",
                "2002",
                "2003",
                "2004",
                "2005"
        }));
        yearComboBox.addItemListener(e -> arr[3] = (String) yearComboBox.getSelectedItem());

        /*
          programmePanel
         */
        content.add(programmePanel);
        programmePanel.setBorder(BorderFactory.createTitledBorder(b1,"Programme"));

        /*
          programmePanel->2panel
         */
        programmePanel.add(majorProgrammePanel);
        programmePanel.add(yearProgrammePanel);

        /*
          programmePanel->majorProgrammePanel->majorComboBox
         */
        majorProgrammePanel.setBorder(BorderFactory.createLoweredBevelBorder());
        majorProgrammePanel.add(majorComboBox);
        majorComboBox.setModel(new DefaultComboBoxModel<>(new String[]{
                " ",
                "Telecommunications Engineering with Management",
                "E-commerce Engineering with Law",
                "Internet of Things Engineering"
        }));
        majorComboBox.addItemListener(e -> arr[4] = (String) majorComboBox.getSelectedItem());


        /*
          programmePanel->yearProgrammePanel->yearProgrammeComboBox
         */
        yearProgrammePanel.setBorder(BorderFactory.createLoweredBevelBorder());
        yearProgrammePanel.add(yearProgrammeComboBox);
        yearProgrammeComboBox.setModel(new DefaultComboBoxModel<>(new String[]{
                " ",
                "1",
                "2",
                "3",
                "4"
        }));
        yearProgrammeComboBox.addItemListener(e -> arr[5] = (String) yearProgrammeComboBox.getSelectedItem());


        //emailPanel
        content.add(emailPanel);
        emailPanel.setBorder(BorderFactory.createTitledBorder(b1,"Email"));

        //emailPanel->emailTextField
        emailPanel.add(emailTextField);
        emailTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                arr[6] = emailTextField.getText();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                arr[6] = emailTextField.getText();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                arr[6] = emailTextField.getText();
            }
        });


        //PhonePanel
        content.add(PhonePanel);
        PhonePanel.setBorder(BorderFactory.createTitledBorder(b1,"Phone number"));

        //PhonePanel->phoneTextField
        PhonePanel.add(phoneTextField);
        phoneTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                arr[7] = phoneTextField.getText();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                arr[7] = phoneTextField.getText();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                arr[7] = phoneTextField.getText();
            }
        });

        //bookPanel
        content.add(bookPanel);
        bookPanel.setBorder(BorderFactory.createTitledBorder(b1,"Booking reference code"));

        //bookPanel->bookTextField
        bookPanel.add(bookTextField);
        bookTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                arr[8] = bookTextField.getText();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                arr[8] = bookTextField.getText();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                arr[8] = bookTextField.getText();
            }
        });

        //checkPanel
        content.add(checkPanel);
        checkPanel.setBorder(b1);

        //checkPanel->2panel
        checkPanel.add(agreePanel);
        checkPanel.add(confirmPanel);
        agreePanel.add(agreeCheckBox);
        confirmPanel.add(confirmCheckBox);
        agreeCheckBox.addActionListener(e -> {
            if(agreeCheckBox.isSelected()){
                this.agreeFlag = true;
            }
        });
        confirmCheckBox.addActionListener(e -> {
            if(confirmCheckBox.isSelected()){
                this.confirmFlag = true;
            }
        });


        //buttonPanel
        content.add(buttonPanel);
        buttonPanel.setLayout(null);
        buttonPanel.setBorder(BorderFactory.createLoweredBevelBorder());
        buttonPanel.add(exitButton);
        buttonPanel.add(nextStepButton);
        buttonPanel.add(clearButton);
        nextStepButton.setBounds(100,25,120,30);
        exitButton.setBounds(240,25,80,30);
        clearButton.setBounds(360,25,80,30);


        nextStepButton.addActionListener(e ->  
             {

                if(arr[0].length()==0 || arr[1].length()==0 || arr[2].length()==0 || arr[3].length()==0 || arr[4].length()==0 || arr[5].length()==0 || arr[6].length()==0 || arr[7].length()==0 || arr[8].length()==0 || !agreeFlag || !confirmFlag){
                    errorPane();
                    if(arr[0].equals("")){
                        firstNamePanel.setBorder(BorderFactory.createTitledBorder(b4,"First Name"));
                    }
                    if(arr[1].equals("")){
                        surNamePanel.setBorder(BorderFactory.createTitledBorder(b4,"SurName"));
                    }
                    if(arr[2].equals("")){
                        monthPanel.setBorder(BorderFactory.createTitledBorder(b4,"Month"));
                    }
                    if(arr[3].equals("")){
                        yearPanel.setBorder(BorderFactory.createTitledBorder(b4,"Month"));
                    }
                    if(arr[4].equals("")){
                        majorProgrammePanel.setBorder(BorderFactory.createTitledBorder(b4));
                    }
                    if(arr[5].equals("")){
                        yearProgrammePanel.setBorder(BorderFactory.createTitledBorder(b4));
                    }
                    if(arr[6].equals("")){
                        emailTextField.setBorder(BorderFactory.createTitledBorder(b4,"Email"));
                    }
                    if(arr[7].equals("")){
                        phoneTextField.setBorder(BorderFactory.createTitledBorder(b4,"Phone number"));
                    }
                    if(arr[8].equals("")){
                        bookTextField.setBorder(BorderFactory.createTitledBorder(b4,"Booking reference code"));
                    }
                    if(!agreeFlag){
                        agreePanel.setBorder(BorderFactory.createTitledBorder(b4));
                    }
                    if(!confirmFlag){
                        confirmPanel.setBorder(BorderFactory.createTitledBorder(b4));
                    }
                }else if (JOptionPane.showConfirmDialog(null,
                        "Have you checked all the information is correct? You can't change the information once the information is submitted",
                        "Confirm check in?",
                        JOptionPane.YES_NO_OPTION) == 0) {
                    dispose();

                    JFrame anotherFrame = new AnotherFrame(arr);

                    anotherFrame.setLocationRelativeTo(null);
                    anotherFrame.setSize(new Dimension(500,200));
                    anotherFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    anotherFrame.setTitle("Check in complete!");

                    anotherFrame.setVisible(true);
                }
        });

        clearButton.addActionListener(e -> {
            firstNameTextField.setText("");
            surNameTextField.setText("");
            monthComboBox.setSelectedIndex(0);
            yearComboBox.setSelectedIndex(0);
            majorComboBox.setSelectedIndex(0);
            yearProgrammeComboBox.setSelectedIndex(0);


            emailTextField.setText("");
            phoneTextField.setText("");
            bookTextField.setText("");
            agreeCheckBox.setSelected(false);
            confirmCheckBox.setSelected(false);

            for(int i = 0; i < arr.length; i++){
                arr[i] = "";
            }
        });

        exitButton.addActionListener(e -> System.exit(0));

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    /**
     * Error pane.
     */
    public void errorPane(){
        JOptionPane.showMessageDialog(null, "Please fill in the the missing information","Missing information",JOptionPane.WARNING_MESSAGE);
    }
}
