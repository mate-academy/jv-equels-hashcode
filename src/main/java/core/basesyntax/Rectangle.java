package core.basesyntax;

//import java.util.Objects;

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
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        if (!width.equals(rectangle.width)) {
            return false;
        }
        if (!length.equals(rectangle.length)) {
            return false;
        }
        return color.equals(rectangle.color);
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = 31 * result + width;
        result = 31 * result + length;
        result = 31 * result + (color != null ? color.length() : 0);
        return result;
    }
}
