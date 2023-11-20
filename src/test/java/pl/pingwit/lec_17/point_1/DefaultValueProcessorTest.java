package pl.pingwit.lec_17.point_1;

import org.junit.jupiter.api.Test;
import pl.pingwit.lec_16.point_1.UserInfo;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class DefaultValueProcessorTest {

    DefaultValueProcessor defaultValueProcessor = new DefaultValueProcessor();

    @Test
    void shouldSetNow_whenLocalDateIsNull() throws IllegalAccessException {
        // given
        UserInfo userInfoWithNullDate = new UserInfo("test", "test", "test", "test", null);
        UserInfo expected = new UserInfo("test", "test", "test", "test", LocalDate.now());

        // when
        defaultValueProcessor.process(userInfoWithNullDate);

        // then
        assertThat(userInfoWithNullDate).isEqualTo(expected);
    }
}