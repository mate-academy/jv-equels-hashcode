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
        return ((this.length == rectangle.length) || (this.length != null
                && this.length.equals(rectangle.length)))
                && ((this.width == rectangle.width) || (this.width != null
                && this.width.equals(rectangle.width)))
                && ((this.color == rectangle.color) || (this.color != null
                && this.color.equals(rectangle.color)));
    }

    @Override
    public int hashCode() {
        return 31 * length.hashCode() * width.hashCode() * color.hashCode();
    }
}


