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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) o;
            if (!this.width.equals(rectangle.width)) {
                return false;
            }
            if (!this.length.equals(rectangle.length)) {
                return false;
            }
            return this.color.equals(rectangle.color);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (31 * width * 2 * Math.sqrt(length) + color.length());
    }

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
}
