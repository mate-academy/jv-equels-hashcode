package core.basesyntax;

/**
 * <p>Дан класс Rectangle. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
 * сравнивал экземпляры Rectangle по содержимому полей width и length,
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
        if (obj instanceof Rectangle) {
            Rectangle rectangleObj = (Rectangle) obj;
            return (this.width.equals(rectangleObj.width)
                    && this.length.equals(rectangleObj.length)
                    && this.color.equals(rectangleObj.color));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = (width != null ? width : 0) + (length != null ? length : 0)
                + (color != null ? color.length() : 0);
        return result;
    }
}
