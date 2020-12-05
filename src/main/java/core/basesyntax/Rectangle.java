package core.basesyntax;

import java.util.Objects;

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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return Objects.equals(width, rectangle.width)
                && Objects.equals(length, rectangle.length)
                && Objects.equals(color, rectangle.color);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(width, length, color);
    }
}
