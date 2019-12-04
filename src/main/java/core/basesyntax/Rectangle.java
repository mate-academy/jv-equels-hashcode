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
    public boolean equals(Object rectangle) {
        if (rectangle instanceof Rectangle) {
            Rectangle rectangleObj = (Rectangle) rectangle;
            if (this.color.equals(rectangleObj.color)
                    && this.length.equals(rectangleObj.length)
                    && this.width.equals(rectangleObj.width)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result;
        result = 18 * (color.length() + width + length);
        return result;
    }
}
