package IoTUniversalRemote.IoTHub.model;

import java.util.UUID;

public class Dashboard {

    private final UUID ID;
    private final String name;
    private final Integer intX;
    private final Integer intY;
    private final Widget[] widgetList;

    public Dashboard(UUID ID, String name, Integer intX, Integer intY, Widget[] widgetList) {
        this.ID = ID;
        this.name = name;
        this.intX = intX;
        this.intY = intY;
        this.widgetList = widgetList;
    }

    public UUID getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Integer getIntX() {
        return intX;
    }

    public Integer getIntY() {
        return intY;
    }

    public Widget[] getWidgetList() {
        return widgetList;
    }
}
