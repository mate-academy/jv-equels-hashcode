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
    public int hashCode() {
        int result = 42;
        result = result * 32 * width.hashCode();
        result = result * 32 * length.hashCode();
        result = result * 32 * color.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Rectangle
                && ((Rectangle) obj).getColor().equals(this.color)
                && ((Rectangle) obj).getLength().equals(this.length)
                && ((Rectangle) obj).getWidth().equals(this.width);
    }
}
