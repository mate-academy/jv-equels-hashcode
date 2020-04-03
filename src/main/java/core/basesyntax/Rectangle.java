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
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(getClass())) {
            Rectangle rectangle = (Rectangle) obj;
            return color.equals(rectangle.color)
                    && width.equals(rectangle.width)
                    && length.equals(rectangle.length);
        }
        return false;

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (color != null ? length.hashCode() : 0);
        result = 31 * result + (color != null ? width.hashCode() : 0);
        return result;
    }
}
