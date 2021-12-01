package AlexLessonClassesExtends;

public class Shirt {

    private String color;
    private char size;

    Shirt(String color, char size) {
        this.color = color;
        this.size = size;
    }

    public void putOn() {
        System.out.println("put on");
    }

    public void putOff() {

        System.out.println("put off");
    }

    public String getColor() {
        return color;
    }

    public char getSize() {
        return size;
    }

    public void setColor(String newColor) {
        color = newColor;

    }

    public void setSize(char newSize) {
        size = newSize;

    }

}
