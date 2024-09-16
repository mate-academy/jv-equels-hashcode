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
            return (this.color == null && current.color == null || this.color.equals(current.color))
                    && (this.length == null && current.length == null
                    || this.length.equals(current.length)) && (this.width == null
                    && current.width == null || this.width.equals(current.width));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += 31 * result + (width == null ? 0 : width.hashCode());
        result += 31 * result + (length == null ? 0 : length.hashCode());
        result += 31 * result + (color == null ? 0 : color.hashCode());
        return result;
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
}
