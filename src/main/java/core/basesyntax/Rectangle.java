package core.basesyntax;

/**
 * <p>Дан класс Rectangle. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
 * сравнивал экземпляры Rectangle по содержимому полей color, width и length,
 * а hashCode() был бы согласованным с реализацией equals().</p>
 */
public class Rectangle {
    private static final int HASHCODENUMBER = 31;
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
        if (obj.getClass().equals(Rectangle.class)) {
            Rectangle rectangle = (Rectangle) obj;
            return (color != null && color.equals(rectangle.color)
                    || (rectangle.color == color))
                    && (width != null && width.equals(rectangle.width)
                    || (rectangle.width == width))
                    && (length != null && length.equals(rectangle.length)
                    || (rectangle.length == length));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result *= HASHCODENUMBER + (width != null ? width.hashCode() : 0);
        result *= HASHCODENUMBER + (color != null ? color.hashCode() : 0);
        result *= HASHCODENUMBER + (length != null ? length.hashCode() : 0);
        return result;
    }
}
