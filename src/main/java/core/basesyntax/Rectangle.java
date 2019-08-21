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
    public boolean equals(Object rec) {
        if (this == rec) {
            return true;
        }
        if (rec instanceof Rectangle) {
            Rectangle rectangleObj = (Rectangle) rec;
            if (!this.width.equals(rectangleObj.width)) {
                return false;
            }
            if (!this.length.equals(rectangleObj.length)) {
                return false;
            }
            if (!this.color.equals(rectangleObj.color)) {
                return false;
            }
            return true;
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
