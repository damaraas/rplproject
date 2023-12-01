package springhibernate.config;

import springhibernate.model.Barang;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class BarangTableModel extends AbstractTableModel {

    private List<Barang> barangs = new ArrayList<>();
    private final String HEADER[] = {"Nama Barang", "Jenis Barang", "Jumlah Barang", "Kondisi Barang"};

    public BarangTableModel(List<Barang> barangs) {
        this.barangs = barangs;
    }

    @Override
    public int getRowCount() {
        return barangs.size();
    }

    @Override
    public int getColumnCount() {
        return HEADER.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return HEADER[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Barang barang = barangs.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return barang.getNama();
            case 1:
                return barang.getJenis();
            case 2:
                return barang.getJumlah();
            case 3:
                return barang.getKondisi();
            default:
                return null;
        }
    }
}