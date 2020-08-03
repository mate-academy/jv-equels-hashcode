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
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) object;
        return width == null && rectangle.width == null
                || width != null && rectangle.width.equals(width)
                && length == null && rectangle.length == null
                || color != null && rectangle.color.equals(color);
    }

    @Override
    public int hashCode() {
        int primaryNumber = 14;
        return ((primaryNumber * 7 + (width == null ? 0 : width))
                * 7 + (length == null ? 0 : length))
                * 7 + (color == null ? 0 : color.hashCode());
    }
}
