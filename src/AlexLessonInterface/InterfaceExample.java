package AlexLessonInterface;

public class InterfaceExample implements WaterBottleInterface {



    @Override
    public void fillUpTheBottle() {
        System.out.println("it is filled");
        System.out.println("Remember, water density is constance (kg/meters^3): " + WATER_DENSITY);
        System.out.println();
   }

    @Override
    public void methodWithParameter() {
        System.out.println();
    }

}
