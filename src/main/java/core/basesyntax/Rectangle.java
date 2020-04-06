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
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj.getClass().equals(getClass())) {
            Rectangle rectangle = (Rectangle) obj;
            return color.equals(rectangle.color)
                  && length.equals(rectangle.getLength())
                  && width.equals(rectangle.getWidth());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (12 * (width == null ? 125 : width.hashCode()))
                + (97 * (color == null ? 3256 : color.hashCode()))
                + (5 * (length == null ? 145 : length.hashCode()));
    }
}
