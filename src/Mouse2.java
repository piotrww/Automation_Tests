public class Mouse2 extends Mouse {

    private final String color;
    private final int numberOfButtons;


    Mouse2(String color, int numberOfButtons) {
        this.color = color;
        this.numberOfButtons = numberOfButtons;
        System.out.println("konstruktor z Mouse2");

    }



    public void connectToBlueTooth() {
        System.out.println("connected");
    }


}
