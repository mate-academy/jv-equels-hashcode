package core.basesyntax;

//Функція hashcode() повертає хешкод(унікальний номер) буль-якого ненульового
//аргументу та 0 у тому випадку, коли цей аргумент == null
//При цьому, ти ніколи не отримуєш NullPointerException
//Тобто, якщо поля будуть дорівнювати null, функція поверне 0

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
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(getClass())) {
            Rectangle rectangle = (Rectangle) object;
            return width.equals(rectangle.width) && length.equals(rectangle.length)
                    && color.equals(rectangle.color);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + width.hashCode();
        result = result * 31 + length.hashCode();
        result = result * 31 + color.hashCode();
        return result;
    }
}
