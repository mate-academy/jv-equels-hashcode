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
        final int prime = 47;
        int result = 1;
        result = prime * result + (width == null ? 0 : width.hashCode());
        result = prime * result + (color == null ? 0 : color.hashCode());
        result = prime * result + (length == null ? 0 : length.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object figure) {
        if (this == figure) {
            return true;
        }
        if (figure == null || getClass() != figure.getClass()) {
            return false;
        }
        Rectangle recta = (Rectangle) figure;
        return (width == recta.width || (width != null && width.equals(recta.getWidth())))
                && (length == recta.length || (length != null && length.equals(recta.getLength())))
                && (color == recta.color || (color != null && color.equals(recta.getColor())));
    }
}
