package DAOS;

import Entity.User;

import java.util.List;

public interface DriverDAO {

    User createUser(User user);

    User getUserById(int id);

    User getUserByUser(String username);

    List<User> getAllUsers();

    User updateUser(User user);
    void deleteUserById(int id);
}