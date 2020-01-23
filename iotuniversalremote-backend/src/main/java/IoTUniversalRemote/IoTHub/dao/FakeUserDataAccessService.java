package IoTUniversalRemote.IoTHub.dao;

import IoTUniversalRemote.IoTHub.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakeUserDataAccessService implements UserDao {

    private static List<User> UserDB = new ArrayList<>();

    @Override
    public int insertUser(UUID id, User user) {
        UserDB.add(new User(user.getUsername(), user.getPassword()));
        return 1;
    }

    @Override
    public List<User> selectAllUser() {
        return UserDB;
    }

    @Override
    public Optional<User> selectUserByID(UUID id) {
        return UserDB.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deleteUserById(UUID id) {
        Optional<User> userMaybe = selectUserByID(id);
        if (userMaybe.isEmpty()) {
            return 0;
        }
        UserDB.remove(userMaybe.get());
        return 1;
    }

    @Override
    public int updateUserByID(UUID id, User newUser) {
        return selectUserByID(id)
                .map(user -> {
                    int indexOfUserToUpdate = UserDB.indexOf(user);
                    if (indexOfUserToUpdate >= 0) {
                        UserDB.set(indexOfUserToUpdate, new User(newUser.getUsername(), newUser.getPassword()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }
}
