import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MyTableForm {
    private JTable studentTable;
    private JPanel mainPanel;
    private JButton Añadir;
    private JButton Borrar;
    private JPanel buttonsPanel;
    private JScrollPane encabezado;

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
                        new Student("10000001X","George", "Pig",    2)
                )
        );
        List<Student> studentList = new ArrayList<>();
        studentTable.setModel(model);
        Añadir.addActionListener(actionEvent -> {
            Student other = new Student("14523645412P", "Angel", "Torija", 23);

            studentList.add(other);
        });
        Borrar.addActionListener(actionEvent -> {
            int selected = studentTable.getSelectedRow();
            if(selected != 1){

            }
        });
    }




    public static void main(String[] args) {
        JFrame frame = new JFrame();
        var myForm = new MyTableForm();

        frame.setContentPane(myForm.mainPanel);

        frame.setVisible(true);
        frame.pack();
        frame.revalidate();
        frame.repaint();
    }
}

