package pl.pingwit.lec_37.point_1;


import com.zaxxer.hikari.HikariDataSource;
import org.apache.commons.lang3.RandomUtils;
import pl.pingwit.lec_13.point_4.PingwitException;
import pl.pingwit.lec_35.point_1.User;
import pl.pingwit.lec_35.point_1.UserDto;

import javax.sql.DataSource;
import java.sql.*;

/**
 * @author Pavel Radkevich
 * @since 8.06.23
 */
public class CreateUserRightWayApplication {

    private static final String URL = "jdbc:postgresql://localhost:5432/ping_7";
    private static final String USERNAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";

    public static void main(String[] args) {
        HikariDataSource ds = new HikariDataSource();

        ds.setJdbcUrl(URL);
        ds.setUsername(USERNAME);
        ds.setPassword(PASSWORD);


        UserDto userDto = new UserDto("Fedor", "Fedorov", "98978787", "jjjh@kkl.co");
        Integer user = createUser(userDto, ds);
    }

    public static Integer createUser(UserDto userDto, DataSource dataSource) {

        try {
            Connection connection = dataSource.getConnection();

            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO users (id, name, surname, email, phone) VALUES (? , ?, ?, ?, ?)");

            int id = getNextUserId(dataSource);

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, userDto.getName());
            preparedStatement.setString(3, userDto.getSurname());
            preparedStatement.setString(4, userDto.getEmail());
            preparedStatement.setString(5, userDto.getPhone());

            preparedStatement.executeUpdate();

            connection.commit();
            return id;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static Integer getNextUserId(DataSource dataSource) {
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT nextval('user_id_seq')");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt(1);
            } else throw new PingwitException("id not found!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
