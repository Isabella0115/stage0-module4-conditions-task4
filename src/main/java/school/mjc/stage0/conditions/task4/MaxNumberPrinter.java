package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result = first >(second>third?second:third)?first:((second>third)?second:third);
        System.out.println(result);
    }
}