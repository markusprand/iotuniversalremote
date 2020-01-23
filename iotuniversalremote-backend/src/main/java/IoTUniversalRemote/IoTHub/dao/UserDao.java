package IoTUniversalRemote.IoTHub.dao;

import IoTUniversalRemote.IoTHub.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserDao {

    int insertUser(UUID id, User user);

    default int insertUser(User user) {
        UUID id = UUID.randomUUID();
        return insertUser(id, user);
    }

    List<User> selectAllUser();

    Optional<User> selectUserByID(UUID id);

    int deleteUserById(UUID id);

    int updateUserByID(UUID id, User user);
}
