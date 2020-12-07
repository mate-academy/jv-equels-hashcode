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
    public int hashCode() {
        int result = 13;
        result = 31 * result + (width == null ? 0 : width.hashCode());
        result = 31 * result + (length == null ? 0 : length.hashCode());
        result = 31 * result + (color == null ? 0 : color.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object rectangle) {
        if (rectangle == this) {
            return true;
        }
        if (rectangle == null) {
            return false;
        }
        if (!rectangle.getClass().equals(getClass())) {
            return false;
        }
        Rectangle current = (Rectangle) rectangle;
        return (this.width == current.width || this.width != null
                && this.width.equals(current.width))
                && (this.length == current.length || this.length != null
                && this.length.equals(current.length))
                && (this.color == current.color || this.color != null
                && this.color.equals(current.color));
    }
}
