package core.basesyntax;

/**
 * Дан класс Rectangle. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
 * сравнивал экземпляры Rectangle по содержимому полей a и b, а hashCode() был бы согласованным с
 * реализацией equals().
 */
public class Rectangle {
    private Integer width;
    private Integer height;
    private String color;

    public Rectangle(Integer width, Integer height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Integer getA() {
        return width;
    }

    public Integer getB() {
        return height;
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
            if (!this.height.equals(rectangleObj.height)) {
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
        return (width + height) * 31 - color.length() + height;
    }
}
