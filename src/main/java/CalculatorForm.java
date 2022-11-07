import javax.swing.*;

public class CalculatorForm {
    private JPanel mainPanel;
    private JTextField resultTextField;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton delButton;
    private JButton a5Button;
    private JButton a6Button;
    private JButton button3;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton button5;
    private JButton button6;
    private JButton a0Button;
    private JButton button8;
    private JButton xButton;
    private JButton RESETButton;
    private JButton button11;


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        CalculatorForm form = new CalculatorForm();
        frame.setContentPane(form.mainPanel);

        frame.setSize(400, 500);
        frame.repaint();
        frame.revalidate();
    }
}
