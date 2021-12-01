package AlexLessonClassesExtends;

public class Main {
    public void main(String[] args) {
        Shirt myTshirtFromDanmark = new Shirt("bluepinkviolet", 'S');

        System.out.println(myTshirtFromDanmark.getColor());

        System.out.println(myTshirtFromDanmark.getSize());
        myTshirtFromDanmark.putOff();


    }


}
