package j17.sealed_classes_preview;

public sealed class Shape permits Circle, Rectangle, Square {
    private final String type;

    public Shape(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}