package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int num = 10;
        int num1 = -10;
        int result = first > second ? num : num1;
        System.out.println(result);
    }
}