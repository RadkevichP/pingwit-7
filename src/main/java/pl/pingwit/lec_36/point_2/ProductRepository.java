package pl.pingwit.lec_36.point_2;

import java.util.Optional;

public class ProductRepository implements CrudRepository<Integer, Product> {

    @Override
    public Optional<Product> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Integer create(Product product) {
        return null;
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Integer id) {

    }
}
