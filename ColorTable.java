import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ColorTable {
    JFrame f;
    JTable t;
    ColorTable()
    {
        f = new JFrame();
        f.setTitle("Tabel Warna");
        String[][] data = {
                { "merah muda"},
                { "ungu"},{ "orange"},
        };
        String[] columnNames = { "Name"};
        t = new JTable(data, columnNames);
        t.setBounds(30, 40, 400, 200);
        JScrollPane sp = new JScrollPane(t);
        f.add(sp);
        f.setSize(200, 200);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new ColorTable();
    }
}