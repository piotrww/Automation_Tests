package AlexLessonConstructor;

public class Main {
      public static void main(String[]args) {

          Shirt myShirt = new Shirt("BlueYellowViolet", 'L');
          myShirt.putOn();
          System.out.println(myShirt.getColor());
          System.out.println(myShirt.getSize());
          myShirt.takeOff();
      }

}
