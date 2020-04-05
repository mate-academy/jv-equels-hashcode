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
        return obj instanceof Rectangle && (this.getColor().equals(((Rectangle) obj).getColor())
                && this.getLength().equals(((Rectangle) obj).getLength())
                && this.getWidth().equals(((Rectangle) obj).getWidth()));
    }

    @Override
    public int hashCode() {
        int result = 3;
        result = result * 11 + width.hashCode();
        result = result * 11 + length.hashCode();
        result = result * 11 + color.hashCode();
        return result;
    }
}
