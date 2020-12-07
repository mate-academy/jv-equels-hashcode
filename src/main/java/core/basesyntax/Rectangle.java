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
    public boolean equals(Object rect) {
        if (rect == this) {
            return true;
        }
        if (rect == null) {
            return false;
        }
        if (rect.getClass().equals(Rectangle.class)) {
            Rectangle comparator = (Rectangle) rect;
            return ((this.width == null && comparator.width == null)
                && (this.length == null && comparator.length == null)
                && (this.color == null && comparator.color == null))
                || (this.width.equals(comparator.width)
                && this.length.equals(comparator.length)
                && this.color.equals(comparator.color));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 3;
        result = 5 * result + (color == null ? 0 : color.hashCode());
        result = 5 * result + (length == null ? 0 : length);
        result = 5 * result + (width == null ? 0 : width);
        return result;
    }
}
