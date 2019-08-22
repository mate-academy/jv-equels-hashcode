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
            Rectangle rectObj = (Rectangle) obj;

            return this.length.equals(rectObj.length)
                && this.width.equals(rectObj.width)
                && this.color.equals(rectObj.color);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31 * length - 13 + 2 * width * color.length() - 2;
        // Я использую 31, 13, 2. Потому что это уменьшает колизи.
        // то есть уменьшает возможность похожего хэш-кода у других
        //объектов
    }

}
