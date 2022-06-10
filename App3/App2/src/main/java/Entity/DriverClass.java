package Entity;

import DAOS.DriverDAOPostgres;

public class DriverClass {
    public static void main(String[] args) {
        DriverDAOPostgres DAO = new DriverDAOPostgres();
        System.out.println(DAO.getAllUsers());
    }
}
