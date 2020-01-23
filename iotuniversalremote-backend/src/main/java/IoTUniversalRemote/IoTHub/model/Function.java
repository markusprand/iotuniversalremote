package IoTUniversalRemote.IoTHub.model;

import java.util.UUID;

public class Function {

    private final UUID id;
    private final String name;
    private final String gateway;
    private final String command;

    public Function(UUID id, String name, String gateway, String command) {
        this.id = id;
        this.name = name;
        this.gateway = gateway;
        this.command = command;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGateway() {
        return gateway;
    }

    public String getCommand() {
        return command;
    }
}
