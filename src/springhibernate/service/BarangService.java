package springhibernate.service;

import springhibernate.model.Barang;
import java.util.List;

public interface BarangService {
    public void save(Barang barang);
    public void update(Barang barang);
    public void delete(Barang barang);
    public Barang getBarang(String nama);
    public List<Barang> getBarangs();
}