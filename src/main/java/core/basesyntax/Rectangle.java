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
        if (rectangle == null) {
            return false;
        }

        if (this == rectangle) {
            return true;
        }

        if (rectangle.getClass().equals(Rectangle.class)) {
            Rectangle current = (Rectangle) rectangle;
            return (this.width == current.width || this.width != null
                    && this.width.equals(current.width))
                    && (this.color == current.color || this.color != null
                    && this.color.equals(current.color))
                    && (this.length == current.length || this.length != null
                    && this.length.equals(current.length));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 19;
        result = 37 * (width == null ? 0 : width.hashCode());
        result = 37 * (color == null ? 0 : color.hashCode());
        result = 37 * (length == null ? 0 : length.hashCode());
        return result;
    }
}

