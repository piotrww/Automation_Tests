package AlexLessonInterface;

public class Main {

   public static void main(String[] args) {

        InterfaceExample myExample = new InterfaceExample();
        myExample.fillUpTheBottle();
        myExample.methodWithParameter();

        WaterBottleInterface myExampleOfWaterBottle = new InterfaceExample();
        myExampleOfWaterBottle.fillUpTheBottle();
    }

}
