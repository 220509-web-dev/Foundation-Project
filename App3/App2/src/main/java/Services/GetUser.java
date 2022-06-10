package Services;

import DAOS.DriverDAO;
import DAOS.DriverDAOPostgres;
import Entity.User;

import java.sql.SQLException;

public class GetUser {
    public static User getUserById(String id_maybe) throws SQLException {
        int id;
        User driver = new User();
        try {
            id = Integer.parseInt(id_maybe);
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }

        try {
            DriverDAO driverDAO = new DriverDAOPostgres();
            driver = driverDAO.getUserById(id);
        } catch (Throwable e) {
            throw new SQLException();
        }
        return driver;
    }
}