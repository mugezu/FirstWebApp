package DAO;

import ClassJava.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by user on 17.11.2016.
 */
public class UserDaoMock implements UserDao {
    private final Map<String, User> base = new ConcurrentHashMap<>();

    public UserDaoMock() {
        this.base.put("Roma", new User("Roma", "roma"));
        this.base.put("Сергей", new User("Сергей", "сергей"));
        this.base.put("Leo", new User("Leo","leo"));
    }

    @Override
    public User selectByLoginPassword(String login, String password) throws DaoSystemException, NoSuchEntityException, NoAccessException {
        User tmp = null;
        if (!base.containsKey(login)) {
            throw new NoSuchEntityException("No user with login - " + login);
        } else {
            if (password.equals(base.get(login).getPassword())) {
                tmp = base.get(login);
            } else throw new NoAccessException("Incorrect password");
        }
        return tmp;
    }
}
