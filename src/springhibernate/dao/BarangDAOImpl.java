package springhibernate.dao;

import springhibernate.model.Barang;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BarangDAOImpl implements BarangDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Barang barang) {
        sessionFactory.getCurrentSession().save(barang);
    }
    
    @Override
    public void update(Barang barang) {
        sessionFactory.getCurrentSession().save(barang);
    }
    
    @Override
    public void delete(Barang barang) {
        sessionFactory.getCurrentSession().save(barang);
    }
    
    @Override
    public Barang getBarang(String nama) {
        return (Barang) sessionFactory.getCurrentSession().get(Barang.class, nama);
    }

    @Override
    public List<Barang> getBarangs() {
        return sessionFactory.getCurrentSession().createCriteria(Barang.class).list();
    }
}