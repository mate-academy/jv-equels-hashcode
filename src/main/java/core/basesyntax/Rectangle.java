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
            return rectangle.width.equals(width)
                    && rectangle.length.equals(length)
                    && rectangle.color.equals(color);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 73;
        result = width != null ? 57 * result + width.hashCode() : result;
        result = length != null ? 57 * result + length.hashCode() : result;
        result = color != null ? 57 * result + color.hashCode() : result;
        return result;
    }
}
