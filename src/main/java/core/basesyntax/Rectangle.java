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
    public int hashCode() {
        int result = 347;
        result = result * 743 + ((width == null) ? 0 : width.hashCode());
        result = result * 743 + ((length == null) ? 0 : length.hashCode());
        result = result * 743 + ((color == null) ? 0 : color.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (width == null || length == null || color ==null) {
            return true;
        }
        if (object.getClass().equals(Rectangle.class)) {
            Rectangle rectangle = (Rectangle) object;

            return width.equals(rectangle.width)
                    && length.equals(rectangle.length)
                    && color.equals(rectangle.color);
        }
        return false;
    }
}
