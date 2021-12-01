package FunctionWithParam;

public class Square {
    int sideA;
    int sideB;
    int squareAreaResult;

    Square(int sideAq, int sideBq) {
        this.sideA = sideAq;
        this.sideB = sideBq;
    }


    public void squareArea() {
       squareAreaResult = sideA * sideB;
       System.out.println("area: " + squareAreaResult);
    }
}
