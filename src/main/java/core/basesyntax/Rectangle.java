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
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Rectangle other = (Rectangle) object;
        return width.equals(other.width)
                && length.equals(other.length)
                && color.equals(other.color);
    }

    @Override
    public int hashCode() {
        int result = 13;
        result = result * 31 + (width == null ? 0 : width.hashCode());
        result = result * 31 + (length == null ? 0 : length.hashCode());
        result = result * 31 + (color == null ? 0 : color.hashCode());
        return result;
    }
}
