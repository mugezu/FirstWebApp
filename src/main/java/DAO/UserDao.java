package DAO;
import ClassJava.User;

/**
 * Created by user on 17.11.2016.
 */
public interface UserDao {
    public User selectByLoginPassword(String login, String password) throws DaoSystemException,NoSuchEntityException, NoAccessException;

}
