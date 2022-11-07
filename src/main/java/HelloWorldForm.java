import javax.swing.*;

public class HelloWorldForm {
    private JPanel mainPanel;
    private JTextField nameTextField;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;


    public HelloWorldForm() {

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        HelloWorldForm form = new HelloWorldForm();
        frame.setContentPane(form.mainPanel);

        frame.setBounds(0, 0, 200, 200);
        frame.repaint();
        frame.revalidate();
    }
}