package StaticPlayGround;

import java.io.StringReader;

public class ClassToStaticPlayGround {
    static String myStatic = "Text Statyczny";
    private final String myNonStatic;
private final int myIntNonStatic = 4;
    private static final String MY_STATIC_FINAL = "Text Statyczny";

public void add3letters() {
  //  StringBuilder myStringBuilder = new StringBuilder();
 //   myStringBuilder.append(myNonStatic).;

    String myNonStaticChanged = myNonStatic.replace("Text", "NewText");
    String myStaticFinal = MY_STATIC_FINAL.replace("Text", "NewText");

    System.out.println(myNonStaticChanged);
    System.out.println(myStaticFinal);

}

ClassToStaticPlayGround() {
  //  MY_STATIC_FINAL = "text";
    myNonStatic = "text";

}

    public static void answer2Plus2Static() {
        System.out.println("4");
    }

    public void answer2Plus2NonStatic() {
        System.out.println("4");
    }
}

