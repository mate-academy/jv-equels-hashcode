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
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) other;
        return rectangle.getWidth() != null && rectangle.getWidth().equals(this.width)
                && rectangle.getLength() != null && rectangle.getLength().equals(this.length)
                && rectangle.getColor() != null && rectangle.getColor().equals(this.color);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return prime * (color != null ? color.hashCode() :
                Integer.toString(width).hashCode() + Integer.toString(length).hashCode() / 21);
    }

}
