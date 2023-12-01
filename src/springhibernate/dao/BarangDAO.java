package springhibernate.dao;

import springhibernate.model.Barang;
import java.util.List;

public interface BarangDAO {
    public void save(Barang barang);
    public void update(Barang barang);
    public void delete(Barang barang);
    public Barang getBarang(String nama);
    public List<Barang> getBarangs();
}