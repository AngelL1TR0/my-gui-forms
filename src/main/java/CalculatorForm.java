import javax.swing.*;

public class CalculatorForm {
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton RESETButton;
    private JButton button2;
    private JPanel panelNorte;
    private JPanel panelSur;
    private JPanel panelBotones;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton DELButton;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton button10;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton button14;
    private JButton button15;
    private JButton ºButton;
    private JButton button17;
    private JButton button18;

    private void createUIComponents() {
    }

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
