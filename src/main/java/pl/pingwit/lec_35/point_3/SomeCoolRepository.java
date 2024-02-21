package pl.pingwit.lec_35.point_3;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SomeCoolRepository {

    private final DataSource dataSource;

    public SomeCoolRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void deleteSomething(Integer id) {
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement lala = connection.prepareStatement("lala");
            // other logic

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
