package pl.pingwit.lec_28.point_4;

import java.util.Optional;

public interface Repository<T, V> {

    Optional<V> findById(T id);

    T save(V entity);
}
