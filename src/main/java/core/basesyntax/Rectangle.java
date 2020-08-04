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
        return width == null ? rectangle.width == null : width.equals(rectangle.width)
                && length == null ? rectangle.length == null : length.equals(rectangle.length)
                && color == null ? rectangle.color == null : color.equals(rectangle.color);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime * (width == null ? 0 : width.hashCode());
        result = prime * result + (length == null ? 0 : length.hashCode());
        result = prime * result + (color == null ? 0 : color.hashCode());
        return result;
    }
}
