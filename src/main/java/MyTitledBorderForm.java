import javax.swing.*;

public class MyTitledBorderForm {
    private JPanel mainPanel;
    private JPanel search;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        MyTitledBorderForm form = new MyTitledBorderForm();
        frame.setContentPane(form.mainPanel);

        frame.setBounds(200, 500, 200, 300);
        frame.repaint();
        frame.revalidate();
    }

}
