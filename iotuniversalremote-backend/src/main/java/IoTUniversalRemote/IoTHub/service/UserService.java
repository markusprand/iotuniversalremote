package IoTUniversalRemote.IoTHub.service;

import IoTUniversalRemote.IoTHub.dao.UserDao;
import IoTUniversalRemote.IoTHub.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("fakeDao") UserDao userDao) {
        this.userDao = userDao;
    }

    public int addUser(User user) {
        return userDao.insertUser(user);
    }

    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }

    public Optional<User> getUserByID(UUID id) {
        return userDao.selectUserByID(id);
    }

    public int deleteUser(UUID id) {
        return userDao.deleteUserById(id);
    }

    public int updateUser(UUID id, User newUser) {
        return userDao.updateUserByID(id, newUser);
    }
}
