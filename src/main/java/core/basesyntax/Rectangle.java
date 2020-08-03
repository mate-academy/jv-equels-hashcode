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
    public int hashCode() {
        if (width != null || length != null || color != null) {
            int result = 17;
            result = 31 * result + width.hashCode();
            result = 31 * result + length.hashCode();
            result = 31 * result + color.hashCode();
            return result;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        Rectangle rectangle = (Rectangle) obj;
        if (obj.getClass().equals(Rectangle.class)
                && (width != null || length != null || color != null)) {
            return width.equals(rectangle.width)
                    && length.equals(rectangle.length)
                    && color.equals(rectangle.color);
        } else {
            return width == rectangle.width
                    && length == rectangle.length
                    && color == rectangle.color;
        }
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
