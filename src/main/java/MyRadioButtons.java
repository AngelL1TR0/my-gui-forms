import javax.swing.*;

public class MyRadioButtons {

    private JPanel mainPanel;
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton machintoshRadioButton;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JTextArea textArea1;


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyRadioButtons myForm = new MyRadioButtons();

        frame.setContentPane(myForm.mainPanel);

        frame.setVisible(true);
        frame.pack();
        frame.revalidate();
        frame.repaint();
    }
}
