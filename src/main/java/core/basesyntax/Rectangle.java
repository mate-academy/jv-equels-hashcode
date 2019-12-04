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

    @Override
    public int hashCode() {
        int result = 0;
        result = color.length() + width.intValue() + length.intValue();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Rectangle) {
            Rectangle rectangleobj = (Rectangle) obj;
            if (!this.color.equals(rectangleobj.color)) {
                return false;
            }
            if (!this.width.equals(rectangleobj.width)) {
                return false;
            }
            if (!this.length.equals(rectangleobj.length)) {
                return false;
            }
        }
        return true;
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
