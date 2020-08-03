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
        final int prime = 42;
        int result = 1;
        result = prime * result + (width == null ? 0 : width.hashCode());
        result = prime * result + (color == null ? 0 : color.hashCode());
        result = prime * result + (length == null ? 0 : length.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(Rectangle.class)) {
            return false;
        }
        Rectangle objectCast = (Rectangle) obj;
        if (length == null && width == null && color == null && objectCast.color == null
                && objectCast.width == null && objectCast.length == null) {
            return hashCode() == objectCast.hashCode();
        }
        return (length != null && length.equals(objectCast.length))
                && (width != null && width.equals(objectCast.width))
                && (color != null && color.equals(objectCast.color));
    }
}
