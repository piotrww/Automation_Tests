package AlexLessonConstructor;

public class Shirt {
    private final String color;
    private final char size;


    Shirt(String newColor, char newSize) {
        color = newColor;
        size = newSize;
    }

    public String getColor() {
        return color;
    }

    public char getSize() {
        return size;
    }

    public void putOn() {
        System.out.println("Shirt is on!");
    }


    public void takeOff() {
        System.out.println("Shirt is off!");
    }

}
