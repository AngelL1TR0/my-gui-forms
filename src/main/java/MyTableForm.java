import javax.swing.*;
import java.util.List;

public class MyTableForm {
    private JPanel mainPanel;
    private JTable studentTable;

    public MyTableForm() {
        StudentTableModel model = new StudentTableModel(
                List.of(
                        new Student("10000000X","Peppa", "Pig",    4),
                        new Student("10000001X","George", "Pig",    2),
                        new Student("10000002X","Bob", "Esponja",    3),
                        new Student("10000003X","P", "Pocoyo",    6),
                        new Student("10000000X","Peppa", "Pig",    4),
                        new Student("10000001X","George", "Pig",    2),
                        new Student("10000002X","Bob", "Esponja",    3),
                        new Student("10000003X","P", "Pocoyo",    6),
                        new Student("10000000X","Peppa", "Pig",    4),
                        new Student("10000001X","George", "Pig",    2),
                        new Student("10000002X","Bob", "Esponja",    3),
                        new Student("10000003X","P", "Pocoyo",    6),
                        new Student("10000000X","Peppa", "Pig",    4),
                        new Student("10000001X","George", "Pig",    2),
                        new Student("10000002X","Bob", "Esponja",    3),
                        new Student("10000003X","P", "Pocoyo",    6),
                        new Student("10000000X","Peppa", "Pig",    4),
                        new Student("10000001X","George", "Pig",    2),
                        new Student("10000002X","Bob", "Esponja",    3),
                        new Student("10000003X","P", "Pocoyo",    6),new Student("10000000X","Peppa", "Pig",    4),
                        new Student("10000001X","George", "Pig",    2),
                        new Student("10000002X","Bob", "Esponja",    3),
                        new Student("10000003X","P", "Pocoyo",    6),
                        new Student("10000000X","Peppa", "Pig",    4),
                        new Student("10000001X","George", "Pig",    2),
                        new Student("10000002X","Bob", "Esponja",    3),
                        new Student("10000003X","P", "Pocoyo",    6)
                )
        );
        studentTable.setModel(model);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        var myForm = new MyTableForm();

        frame.setContentPane(myForm.mainPanel);

        frame.setVisible(true);
        frame.setSize(300,200);
        frame.revalidate();
        frame.repaint();
    }
}

