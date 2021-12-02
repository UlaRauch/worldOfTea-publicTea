package worldOfTea;

import worldOfTea.Blends.Tea;

public class Cup {
    private Tea content;

    public Cup(Tea tea) {
        this.content = tea;
    }

    public Tea getContent() {
        return content;
    }
}
