package pl.pingwit.lec_35.point_2;


import org.apache.commons.lang3.RandomUtils;
import pl.pingwit.lec_35.point_1.User;
import pl.pingwit.lec_35.point_1.UserDto;

import java.sql.*;

/**
 * @author Pavel Radkevich
 * @since 8.06.23
 */
public class PreparedStatementMain {

    private static final String URL = "jdbc:postgresql://localhost:5432/ping_7";
    private static final String USERNAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            User pupkin = new User(155, "Biba", "Pupkin", "ppp@gmail.com", "9875655");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (id, name, surname, email, phone) VALUES (? , ?, ?, ?, ?)");

            preparedStatement.setInt(1, pupkin.id());
            preparedStatement.setString(2, pupkin.name());
            preparedStatement.setString(3, pupkin.surname());
            preparedStatement.setString(4, pupkin.email());
            preparedStatement.setString(5, pupkin.phone());

            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Integer createUser(UserDto userDto) {

        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO users (id, name, surname, email, phone) VALUES (? , ?, ?, ?, ?)");

            int id = RandomUtils.nextInt(18, 10000);

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, userDto.getName());
            preparedStatement.setString(3, userDto.getSurname());
            preparedStatement.setString(4, userDto.getEmail());
            preparedStatement.setString(5, userDto.getPhone());

            preparedStatement.executeUpdate();

            return id;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
