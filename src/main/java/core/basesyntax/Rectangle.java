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
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) object;
        return this.width.equals(rectangle.width) && this.length.equals(rectangle.length)
                && this.color.equals(rectangle.color);

    }

    @Override
    public int hashCode() {
        int hash = 12;
        hash = hash + this.width == 0 ? 0 : this.width.hashCode();
        hash = hash + this.length == 0 ? 0 : this.length.hashCode();
        hash = hash + this.color.hashCode();
        return hash;
    }
}
