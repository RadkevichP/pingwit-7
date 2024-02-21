package pl.pingwit.lec_36.point_1;

import org.apache.commons.lang3.RandomUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Pavel Radkevich
 * @since 10.06.23
 */
public class TransactionExample {

    private static final String URL = "jdbc:postgresql://localhost:5432/ping_7";
    private static final String USERNAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";


    public static void main(String[] args) {
        runTransactionExample();
    }

    private static void runTransactionExample() {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            connection.setAutoCommit(false);

            String updateAccountQuery = "UPDATE accounts SET amount = ? WHERE id = ?";
            PreparedStatement updateStatement = connection.prepareStatement(updateAccountQuery);

            updateStatement.setInt(1, 150);
            updateStatement.setInt(2, 1);

            updateStatement.executeUpdate();
            System.out.println("Updated 1!");

            if (RandomUtils.nextBoolean()) {
                throw new RuntimeException("пропал свет!");
            }

            updateStatement.setInt(1, 450);
            updateStatement.setInt(2, 2);
            updateStatement.executeUpdate();

            System.out.println("Updated 2!");

            //int a = 180 / 0;
            connection.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
