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

            if ((width == rectangle.getWidth() || (width != null && rectangle.getWidth() != null
                    && width.equals(rectangle.getWidth())))
                    && (length == rectangle.getLength()
                    || (length != null && rectangle.getLength() != null
                    && length.equals(rectangle.getLength())))
                    && (color == rectangle.getColor()
                    || (color != null && rectangle.getLength() != null
                    && color.equals(rectangle.getColor())))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (width != null ? color.hashCode() : 0);
        result = 31 * result + (length != null ? color.hashCode() : 0);
        return result;
    }
}
