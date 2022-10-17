import javax.swing.*;

public class HelloWordlForm {
    JPanel mainPanel;
    private JTextField nameTextField;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;


    public HelloWordlForm() {

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        HelloWordlForm form = new HelloWordlForm();
        frame.setContentPane(form.mainPanel);

        frame.setBounds(0, 0, 200, 200);
        frame.repaint();
        frame.revalidate();
    }
}