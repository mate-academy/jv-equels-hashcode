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
        Rectangle current = (Rectangle) obj;
        return (this.width == null || this.width.equals(current.width))
                && (this.length == null || this.length.equals(current.length))
                && (this.color == null || this.color.equals(current.color));
    }

    @Override
    public int hashCode() {
        int result = 13;
        result = 19 * result + (width == null ? 0 : width);
        result = 19 * result + (length == null ? 0 : length);
        result = 19 * result + (color == null ? 0 : color.hashCode());
        return result;
    }
}
