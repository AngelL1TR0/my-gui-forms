import javax.swing.*;

public class MyTitledBorderForm {
    private JPanel mainPanel;
    private JRadioButton byNameRadioButton;
    private JRadioButton byIDRadioButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        MyTitledBorderForm form = new MyTitledBorderForm();
        frame.setContentPane(form.mainPanel);

        frame.pack();
        frame.repaint();
        frame.revalidate();
    }
}