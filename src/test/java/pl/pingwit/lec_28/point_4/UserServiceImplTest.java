package pl.pingwit.lec_28.point_4;

import org.junit.jupiter.api.Test;
import pl.pingwit.lec_13.point_4.PingwitException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class UserServiceImplTest {

    private final Repository<Long, UserEntity> userRepository = mock(Repository.class);
    private final UserConverter userConverter = mock(UserConverter.class);

    private final UserServiceImpl target = new UserServiceImpl(userRepository, userConverter);


    @Test
    void shouldThrowPingwitExceptionWhenUserNotFound() {
        // given
        Long id = 1L;


        // when
        PingwitException exception = assertThrows(PingwitException.class, () -> target.findUserById(id));

        // then
        assertThat(exception.getMessage()).isEqualTo("User not found: " + 1L);

    }
}