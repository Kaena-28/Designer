public class Rectangle {
    String name;
    String color;
    int size;

    public Rectangle() {
    }

    public Rectangle(String name, String color, int size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}