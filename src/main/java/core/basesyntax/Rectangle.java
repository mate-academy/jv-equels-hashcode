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
        if (object == null) {
            return false;
        }
        Rectangle rectangle = (Rectangle) object;
        if ((this.color == null && rectangle.color == null)
                && (this.length == null && rectangle.length == null)
                && (this.width == null && rectangle.width == null)) {
            return true;
        } else if (object.getClass().equals(Rectangle.class)) {
            return (this.color != null && this.color.equals(rectangle.color))
                    && (this.length != null && this.length.equals(rectangle.length))
                    && (this.width != null && this.width.equals(rectangle.width));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 11 * result + (color == null ? 0 : color.hashCode());
        result = 11 * result + (width == null ? 0 : width.hashCode());
        result = 11 * result + (length == null ? 0 : length.hashCode());
        return result;
    }
}
