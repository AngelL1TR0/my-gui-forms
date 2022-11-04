import javax.swing.table.AbstractTableModel;
import java.util.List;

public class StudentTableModel extends AbstractTableModel {

    private enum StudentTableColumns {
        Name, Surname, Nif, Age
    }

    private List<Student> students;

    public StudentTableModel(List<Student> students) {
        super();
        this.students = students;
    }

    @Override
    public int getRowCount() {
        return students.size();
    }

    @Override
    public int getColumnCount() {
        return StudentTableColumns.values().length;
    }

    @Override
    public String getColumnName(int column) {
        // StudentTableColumns.values() = [Name, Surname, Nif, Age]
        switch (StudentTableColumns.values()[column]) {
            case Name:
                return "Nombre";
            case Surname:
                return "Apellidos";
            case Nif:
                return "NIF";
            case Age:
                return "Edad";
            default:
                throw new RuntimeException("No existe la columna " + column);
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student student = students.get(rowIndex);
        switch (StudentTableColumns.values()[columnIndex]) {
            case Name:
                return student.getName();
            case Surname:
                return student.getSurname();
            case Nif:
                return student.getNif();
            case Age:
                return student.getAge();
            default:
                throw new RuntimeException("No existe la columna " + columnIndex);
        }
    }
}