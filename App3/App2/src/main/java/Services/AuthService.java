//package Services;
//
//import DAOS.DriverDAOPostgres;
//import Entity.DriverClass;
//import Entity.User;
//import java.util.List;
//
//public class AuthService {

//    static DriverDAOPostgres driverDAO = new DriverDAOPostgres();
//
//    private final DriverDAOPostgres driverDAOPostgres;
//
//    public AuthService(DriverDAOPostgres driverDAOPostgres, DriverDAOPostgres driverDAOPostgres1) {
//
//        this.driverDAOPostgres = driverDAOPostgres1;
//        this.driverDAO = driverDAO;
//    }
//
//    public User login(String username, String password)
//    {
//        List<User> users = new DriverDAOPostgres().getAccs();
//        for(User user : users){
//            if(username.equals(user.getUsername()) && password.equals(user.getPassword()))
//            {
//                System.out.println("Logged In");
//                return user;
//
//            }
//            else if (username.equals(user.getUsername()) && !password.equals(user.getPassword()))
//            {
//                System.out.println("Wrong Password!");
//                throw new Exceptions.InvalidLogin("Wrong Username or Password");
//            }
//            else{
//                System.out.println("Account does not exist.");
//                throw new Exceptions.InvalidLogin("Account does not exist.");
//            }
//        }
//        return null;
//
//}