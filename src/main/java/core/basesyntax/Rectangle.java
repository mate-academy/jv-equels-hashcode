package core.basesyntax;

import java.util.Objects;

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
        if (obj instanceof Rectangle) {
            return ((Rectangle) obj).getColor().equals(this.color)
                    && ((Rectangle) obj).getLength().equals(this.length)
                    && ((Rectangle) obj).getWidth().equals(this.width);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.color,this.length,this.width);
    }


}
