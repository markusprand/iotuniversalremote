package IoTUniversalRemote.IoTHub.controller;

import IoTUniversalRemote.IoTHub.model.User;
import IoTUniversalRemote.IoTHub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "http://localhost:8080/api", maxAge = 3600)
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getAllUser() {
        return userService.getAllUser();
    }
/*
    @GetMapping(path = "{id}")
    public User getUserByID(@PathVariable("id") UUID id) {
        return userService.getUserByID(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteUserByID(@PathVariable("id") UUID id) {
        userService.deleteUser(id);
    }

    @PutMapping(path = "{id}")
    public void updateUser(@PathVariable("id") UUID id, @RequestBody User userToUpdate) {
        userService.updateUser(id, userToUpdate);
    }

 */
}
