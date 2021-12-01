public class Main {
    public static void main(String[] args){


        System.out.print("Hello World");
        Mouse1 m1 = new Mouse1();
        m1.clickLeft();
        m1.clickRight();
//        m1.texture2;
//        m1.texture;


        Mouse2 m2 = new Mouse2("blue", 4);
        m2.clickLeft();
        m2.connectToBlueTooth();

        m2.clickRight();


        Mouse mouseKid = new Mouse2("red", 3);
        mouseKid.clickLeft();



        Mouse2 m22 = new Mouse2("re0d", 9);


    }
}