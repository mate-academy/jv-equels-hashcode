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
        int result = 31;
        result = 31 * color.hashCode() * width.hashCode() * length.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this.getClass() == obj.getClass() && obj != null) {
            Rectangle rectangle = (Rectangle) obj;
            if (this.getColor().equals(rectangle.getColor())
                    && this.getWidth().equals(rectangle.getWidth())
                    && this.getLength().equals(rectangle.getLength())) {
                return true;
            }
        }
        return false;
    }
}
