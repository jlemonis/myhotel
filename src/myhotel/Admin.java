package myhotel;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Admin {
  public static void setVisible() {
    DefaultTableModel model = new DefaultTableModel();
    JTable table = new JTable(model);
    ArrayList<ArrayList<String>> reservation = new ArrayList<ArrayList<String>>();
    
    model.addColumn("Name");
    model.addColumn("Type");
    model.addColumn("View");
    model.addColumn("Serice");
    model.addColumn("Check-In");
    model.addColumn("Date");
    
    reservation = Database.export();
    Integer len = reservation.size();
    Integer i;
    
    for (i=0; i<len; i++){
    	model.addRow(new Object[] { reservation.get(i).get(0), reservation.get(i).get(1), reservation.get(i).get(2), reservation.get(i).get(3), reservation.get(i).get(4), reservation.get(i).get(5)});
    }
    
    JFrame f = new JFrame();
    f.setSize(500, 500);
    f.add(new JScrollPane(table));
    f.setVisible(true);
  }
}
