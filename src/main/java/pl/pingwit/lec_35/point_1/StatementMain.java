package pl.pingwit.lec_35.point_1;

import org.apache.commons.lang3.RandomUtils;
import org.apache.poi.sl.draw.geom.GuideIf;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Pavel Radkevich
 * @since 8.06.23
 */
public class StatementMain {

    // JDBC Java DataBase Connectivity
    private static final String URL = "jdbc:postgresql://localhost:5432/ping_7";
    private static final String USERNAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";

    public static void main(String[] args) {
        int count = runCountQuery();
        System.out.println(String.format("There are %d users in the DataBase", count));

        //findAllUsers().forEach(System.out::println);

        UserDto userToSave = new UserDto("Lena", "Lenina", "ll@lkjh.com", "9886777655");
        Integer userId = createUser(userToSave);
        findUserById(userId).ifPresent(System.out::println);
    }

    /*
    SELECT count(*)
    FROM users;
     */

    public static int runCountQuery() {
        String username = "pingwit";
        String password = "pingwit_password";
        String url = "jdbc:postgresql://localhost:5432/ping_7";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("""
                    SELECT count(*)
                    FROM users;
                    """);
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                ///String count = resultSet.getString(1);
                //return Integer.parseInt(count);
                return count;
            } else {
                return 0;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<User> findAllUsers() {
        String username = "pingwit";
        String password = "pingwit_password";
        String url = "jdbc:postgresql://localhost:5432/ping_7";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("""
                    SELECT id, name, surname, email, phone
                    FROM users;
                    """);
            List<User> users = new ArrayList<>();
            while (rs.next()) {
                users.add(new User(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5))
                );
            }
            return users;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static Optional<User> findUserById(Integer id) {
        String username = "pingwit";
        String password = "pingwit_password";
        String url = "jdbc:postgresql://localhost:5432/ping_7";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();
            String request = String.format("""
                    SELECT id, name, surname, email, phone
                    FROM users
                    WHERE id =%d;
                    """, id);
            ResultSet rs = statement.executeQuery(request);
            if (rs.next()) {
                return Optional.of(new User(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5))
                );
            }
            return Optional.empty();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Integer createUser(UserDto userDto) {

        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();

            int id = RandomUtils.nextInt(18, 10000);

            String request = String.format("""
                    INSERT INTO public.users(
                                 	id, name, surname, email, phone)
                                 	VALUES (%d, '%s', '%s', '%s', '%s');
                    """, id, userDto.getName(), userDto.getSurname(), userDto.getEmail(), userDto.getPhone());

            statement.execute(request);
            // sql injection
            return id;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
