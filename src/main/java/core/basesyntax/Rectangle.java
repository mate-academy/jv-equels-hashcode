package core.basesyntax;

public class Rectangle {
    private Integer width;
    private Integer length;
    private String color;

    public Rectangle(Integer width, Integer length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int hashCode() {
        int seed = 13;
        seed += (length != null) ? seed * length : 0;
        seed += (width != null) ? seed * width : 0;
        seed += (color != null) ? seed * color.hashCode() : 0;
        return seed;
    }

    @Override
    public boolean equals(Object rectangle) {
        if (rectangle == this) {
            return true;
        }
        if (rectangle == null) {
            return false;
        }
        if (rectangle.getClass().equals(Rectangle.class)) {
            Rectangle current = (Rectangle) rectangle;
            return (width == current.getWidth() || width.equals(current.getWidth()))
                    && (length == current.getLength() || length.equals(current.getLength()))
                    && (color == current.getColor() || color.equals(current.getColor()));
        }
        return false;
    }
}
