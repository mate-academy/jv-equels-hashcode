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
        if (object.getClass().equals(getClass())) {
            Rectangle rectangle = (Rectangle) object;
            return width.equals(rectangle.width)
                    && length.equals(rectangle.length)
                    && color.equals(rectangle.color);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int code = 10;
        code *= 21 + width.hashCode();
        code *= 21 + length.hashCode();
        code *= 21 + color.hashCode();
        return code;
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
}
