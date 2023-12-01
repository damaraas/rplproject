package springhibernate.controller;

import springhibernate.App;
import springhibernate.config.BarangTableModel;
import springhibernate.model.Barang;
import springhibernate.view.BarangView;
import springhibernate.service.BarangService;
import java.util.List;
import javax.swing.JOptionPane;

public class BarangController {
    private final BarangView barangView;
    private BarangTableModel barangTableModel;
    private List<Barang> barangs;

    public BarangController(BarangView barangView) {
        this.barangView = barangView;
    }

    public void tampilData() {
       barangs = App.getBarangService().getBarangs(); 
       barangTableModel = new BarangTableModel(barangs); 
       this.barangView.getTabel().setModel(barangTableModel);
    }
    
    public void show() {
        int index = this.barangView.getTabel().getSelectedRow(); 
        this.barangView.getNama().setText(String.valueOf( 
        this.barangView.getTabel().getValueAt(index, 0))); 
        this.barangView.getJenis().setText(String.valueOf( 
        this.barangView.getTabel().getValueAt(index, 1)));
        this.barangView.getJumlah().setText(String.valueOf( 
        this.barangView.getTabel().getValueAt(index, 2)));
        this.barangView.getKondisi().setText(String.valueOf( 
        this.barangView.getTabel().getValueAt(index, 3)));
    }
    
    public void clear() { 
        this.barangView.getNama().setText("");
        this.barangView.getJenis().setText(""); 
        this.barangView.getJumlah().setText(""); 
        this.barangView.getKondisi().setText("");
    }
    
    public void saveBarang() {
        Barang barang = new Barang(); 
        barang.setNama(this.barangView.getNama().getText()); 
        barang.setJenis(this.barangView.getJenis().getText()); 
        barang.setJumlah(Integer.parseInt(this.barangView.getJumlah().getText()));
        barang.setKondisi(this.barangView.getKondisi().getText()); 
        App.getBarangService().save(barang); 
        JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan", "info", 
        JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void updateBarang() {
        Barang barang = new Barang(); 
        barang.setNama(this.barangView.getNama().getText()); 
        barang.setJenis(this.barangView.getJenis().getText()); 
        barang.setJumlah(Integer.parseInt(this.barangView.getJumlah().getText()));
        barang.setKondisi(this.barangView.getKondisi().getText()); 
        App.getBarangService().update(barang); 
        JOptionPane.showMessageDialog(null, "Data Berhasil di Edit", "info", 
        JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void deleteBarang() {
        if(this.barangView.getNama().getText() == null){
            JOptionPane.showMessageDialog(null, "Hahasiswa belum dipilih", "error", JOptionPane.ERROR_MESSAGE);
    }else{
        Barang barang = new Barang();
        barang.setNama(this.barangView.getNama().getText());
        int pilih = JOptionPane.showConfirmDialog(null, "Apakah data ingin dihapus?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(pilih == JOptionPane.YES_OPTION){
            App.getBarangService().delete(barang);
            JOptionPane.showMessageDialog(null, "Data Berhasil dihapus", "info", JOptionPane.INFORMATION_MESSAGE);
            clear();
            tampilData();
        }
    }
    }
}