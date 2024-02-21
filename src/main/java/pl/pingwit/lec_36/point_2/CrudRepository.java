package pl.pingwit.lec_36.point_2;

import java.util.Optional;

public interface CrudRepository<K, T> {

    Optional<T> findById(K id);

    K create(T t);

    void update(T t);

    void delete(K id);

}
