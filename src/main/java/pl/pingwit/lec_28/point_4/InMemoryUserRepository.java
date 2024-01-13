package pl.pingwit.lec_28.point_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryUserRepository implements Repository<Long, UserEntity> {

    private static Long NEXT_ID = 0L;
    private final Map<Long, UserEntity> storage = new HashMap<>();

    @Override
    public Long save(UserEntity user) {
        System.out.println("saving user to the DB......");

        Long id = NEXT_ID;

        user.setId(id);
        storage.put(id, user);

        NEXT_ID++;
        return id;
    }

    @Override
    public Optional<UserEntity> findById(Long id) {
        return Optional.ofNullable(storage.get(id));
    }
}
