package pl.pingwit.integration;

import org.junit.jupiter.api.Test;
import pl.pingwit.lec_28.point_4.*;

import static org.assertj.core.api.Assertions.assertThat;

public class UserServiceIT {

    private final UserConverter userConverter = new UserConverter();
    private final Repository<Long, UserEntity> userEntityRepository = new InMemoryUserRepository();
    private final UserService userService = new UserServiceImpl(userEntityRepository, userConverter);


    @Test
    void savedUserShouldBeFound() {
        // given
        UserDTO userDTO = new UserDTO("Pavel", "Radkevich");

        // when
        // 1. save user, get Id
        Long saveUserId = userService.saveUser(userDTO);
        // 2. find user by Id
        UserDTO userFromDb = userService.findUserById(saveUserId);

        // then
        assertThat(userFromDb.getName()).isEqualTo("Pavel");
        assertThat(userFromDb.getSurname()).isEqualTo("Radkevich");
    }
}
