import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ArticleTableModel extends AbstractTableModel {

    private enum ArticleTableColumns{
        Id("Id"),
        Name("Nombre"),
        Price("Precio"),
        Amount("Cantidad");
        final String header;
        ArticleTableColumns(String header) {
            this.header = header;
        }
    }
    private List<Article> articles;

    public ArticleTableModel(List<Article> articles) {
        super();
        this.articles = articles;
    }
    
    @Override
    public int getRowCount() {
        return articles.size();
    }

    @Override
    public int getColumnCount() {
        return ArticleTableColumns.values().length;
    }

    @Override
    public String getColumnName(int column) {
        return ArticleTableColumns.values()[column].header;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Article article = articles.get(row);
        switch (ArticleTableColumns.values()[column]){
            case Id:
                return article.getId();
            case Name:
                return article.getName();
            case Price:
                return article.getPrice();
            case Amount:
                return article.getAmount();
            default:
                throw new RuntimeException("No existe la columna " + column);
        }
    }
}
