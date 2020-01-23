package IoTUniversalRemote.IoTHub.model;

import java.util.UUID;
import java.util.function.Function;

public class Widget {

    private final UUID id;
    private final String name;
    private final Integer sizeX;
    private final Integer sizeY;
    private final String label;
    private final Boolean isVisible;
    private final Integer positionX;
    private final Integer positionY;
    private final Function[] function;

    public Widget(UUID id, String name, Integer sizeX, Integer sizeY, String label, Boolean isVisible, Integer positionX, Integer positionY, Function[] function) {
        this.id = id;
        this.name = name;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.label = label;
        this.isVisible = isVisible;
        this.positionX = positionX;
        this.positionY = positionY;
        this.function = function;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getSizeX() {
        return sizeX;
    }

    public Integer getSizeY() {
        return sizeY;
    }

    public String getLabel() {
        return label;
    }

    public Boolean getVisible() {
        return isVisible;
    }

    public Integer getPositionX() {
        return positionX;
    }

    public Integer getPositionY() {
        return positionY;
    }

    public Function[] getFunction() {
        return function;
    }
}
