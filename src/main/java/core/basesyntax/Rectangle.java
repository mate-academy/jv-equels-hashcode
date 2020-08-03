package core.basesyntax;

/**
 * <p>Дан класс Rectangle. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
 * сравнивал экземпляры Rectangle по содержимому полей color, width и length,
 * а hashCode() был бы согласованным с реализацией equals().</p>
 */
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
        if (object.getClass().equals(Rectangle.class)) {
            Rectangle rectangle = (Rectangle) object;
            return (color != null && color.equals(rectangle.color))
                    || (color == null && rectangle.color == null)
                    && (width != null && width == rectangle.width)
                    || (width == null && rectangle.width == null)
                    && (length != null && length == rectangle.length)
                    || (length == null && rectangle.length == null);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 14;
        result = 28 * result + (color == null ? 0 : color.hashCode());
        result = 28 * result + (width == null ? 0 : width);
        result = 28 * result + (length == null ? 0 : length);
        return result;
    }
}
