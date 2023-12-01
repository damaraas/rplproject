package springhibernate.service;

import springhibernate.dao.BarangDAO;
import springhibernate.model.Barang;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("BarangService")
@Transactional (readOnly = true)

public class BarangServiceImpl implements BarangService {
    @Autowired
    private BarangDAO barangDao;

    @Transactional
    @Override
    public void save(Barang barang) {
        barangDao.save(barang);
    }
    
    @Transactional
    @Override
    public void update(Barang barang) {
        barangDao.update(barang);
    }
    
    @Transactional
    @Override
    public void delete(Barang barang) {
        barangDao.delete(barang);
    }

    @Override
    public Barang getBarang(String nama) {
        return barangDao.getBarang(nama);
    }

    @Override
    public List<Barang> getBarangs() {
        return barangDao.getBarangs();
    }
}