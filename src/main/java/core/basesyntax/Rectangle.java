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
        int generatedHashCode = 9;
        generatedHashCode = generatedHashCode * 19 + width;
        generatedHashCode = generatedHashCode * 19 + length;
        if (color == null) {
            generatedHashCode = generatedHashCode * 19;
        }
        generatedHashCode = generatedHashCode * 19 + color.hashCode();
        return generatedHashCode;
    }
}
