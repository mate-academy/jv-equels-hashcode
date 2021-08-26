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
    public boolean equals(Object rectangle) {
        if (this == rectangle) {
            return true;
        }
        if (rectangle == null) {
            return false;
        }
        if (rectangle.getClass().equals(Rectangle.class)) {
            Rectangle currentReactangle = (Rectangle) rectangle;
            return (width == currentReactangle.width
                    || (width != null && width.equals(currentReactangle.width)))
                    && (length == currentReactangle.length
                    || (length != null && length.equals(currentReactangle.length)))
                    && (color == currentReactangle.color
                    || (color != null && color.equals(currentReactangle.color)));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 19;
        result = 29 * result + (color == null ? 0 : color.hashCode());
        result = 17 * result + (width == null ? 0 : width.hashCode());
        result = 31 * result + (length == null ? 0 : length.hashCode());
        return result;
    }
}
