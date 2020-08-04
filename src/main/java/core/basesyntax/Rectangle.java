package core.basesyntax;

public class Rectangle {
    private final Integer width;
    private final Integer length;
    private final String color;

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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(Rectangle.class)) {
            Rectangle rectangle = (Rectangle) obj;
            return (width == null ? rectangle.width == null
                    : width.equals(rectangle.width))
                    && (length == null ? rectangle.length == null
                    : length.equals(rectangle.length))
                    && (color == null ? rectangle.color == null
                    : color.equals(rectangle.color));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 97 * hash + (width == null ? 0 : width.hashCode());
        hash = 97 * hash + (length == null ? 0 : length.hashCode());
        hash = 97 * hash + (color == null ? 0 : color.hashCode());
        return hash;
    }

}
