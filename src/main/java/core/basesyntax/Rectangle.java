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
        if (this == obj) {
            return true;
        }
        if (obj instanceof Rectangle) {
            Rectangle rectangleObj = (Rectangle) obj;
            if (!this.width.equals(rectangleObj.width)) {
                return false;
            }
            if (!this.length.equals(rectangleObj.length)) {
                return false;
            }
            if (!this.color.equals(rectangleObj.color)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = result * 42 + (color != null ? color.hashCode() : 0);
        result = width * 42 + length / 42 + color.length();
        return result;
    }
}
