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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width
                    || (width != null && width.equals(rectangle.getWidth()))
                && length == rectangle.length
                    || (length != null && length.equals(rectangle.getLength()))
                && color == rectangle.color
                    || (color != null && color.equals(rectangle.getColor()));
    }

    @Override
    public int hashCode() {
        int result = 18;
        result = 32 * result + (width != null ? width.hashCode() : 0);
        result = 32 * result + (length != null ? length.hashCode() : 0);
        result = 32 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
