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

        Rectangle rectangle = (Rectangle) object;

        if (width != null ? !width.equals(rectangle.width) : rectangle.width != null) {
            return false;
        }
        if (length != null ? !length.equals(rectangle.length) : rectangle.length != null) {
            return false;
        }
        return color != null ? color.equals(rectangle.color) : rectangle.color == null;
    }

    @Override
    public int hashCode() {
        int result = width != null ? width.hashCode() : 0;
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
