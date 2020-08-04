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
    public int hashCode() {
        int result = 13;
        result = 31 * result + (width == null ? 0 : width.hashCode());
        result = 31 * result + (length == null ? 0 : length.hashCode());
        result = 31 * result + (color == null ? 0 : color.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !(object.getClass().equals(this.getClass()))) {
            return false;
        }

        Rectangle rect = (Rectangle) object;

        return (width == null || rect.width == null)
                    ? width == rect.width : width.equals(rect.width)
                && (length == null || rect.length == null)
                    ? length == rect.length : length.equals(rect.length)
                && (color == null || rect.color == null)
                    ? color == rect.color : color.equals(rect.color);
    }
}
