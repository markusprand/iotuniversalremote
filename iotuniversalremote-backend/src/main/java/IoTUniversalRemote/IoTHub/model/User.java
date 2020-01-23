package IoTUniversalRemote.IoTHub.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class User {

    private final UUID id;
    private final String username;
    private final String password;

    public User(@JsonProperty("username") String username,
                @JsonProperty("password") String password) {
        this.id = UUID.randomUUID();
        this.username = username;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
