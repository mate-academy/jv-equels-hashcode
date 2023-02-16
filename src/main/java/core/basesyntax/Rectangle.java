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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return (width == rectangle.width || width != null && width.equals(rectangle.width))
                &&
                (length == rectangle.length || length != null && length.equals(rectangle.length))
                &&
                (color == rectangle.color || color != null && color.equals(rectangle.color));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (width != null ? width : 0);
        result = 31 * result + (length != null ? length : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
