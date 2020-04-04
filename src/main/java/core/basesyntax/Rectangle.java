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

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return width != null && length != null && color != null
                && width.equals(rectangle.width)
                && length.equals(rectangle.length)
                && color.equals(rectangle.color);
    }

    public int hashCode() {
        int result = 17;
        if (width != null) {
            result = 31 * result + width.hashCode();
        }
        if (length != null) {
            result = 31 * result + length.hashCode();
        }
        if (color != null) {
            result = 31 * result + color.hashCode();
        }
        return result;
    }
}
