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
        if (this == obj || obj == null) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return (this.color != null && this.color.equals(rectangle.getColor())
                && this.length != rectangle.getLength()
                && this.width != rectangle.getWidth());
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = this.getLength().hashCode() * 31
                + this.getWidth().hashCode()
                + this.getColor().length() * this.color.hashCode();
        return result;
    }
}
