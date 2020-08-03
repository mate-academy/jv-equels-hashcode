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
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Rectangle rectangle = (Rectangle) obj;
        if ((width == rectangle.width) && (length != rectangle.length)
                && (color.equals(rectangle.getColor()))) {
            return true;
        }

        if ((width == null && rectangle.width == null)
                && (length == null && rectangle.length == null)
                && (color == null && rectangle.color == null)) {
            return true;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((width == null) ? 0 : width.hashCode());
        result = prime * result + ((length == null) ? 0 : length.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }
}
