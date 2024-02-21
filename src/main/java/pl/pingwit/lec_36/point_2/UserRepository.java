package pl.pingwit.lec_36.point_2;

import pl.pingwit.lec_35.point_1.User;

import java.util.Optional;

public class UserRepository implements CrudRepository<Integer, User> {
    @Override
    public Optional<User> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Integer create(User user) {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Integer id) {

    }
}
