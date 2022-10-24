
public class Calculator {
    public static void main(String[] args) {

        Addition addition = new Addition();
        Multiplication multiply = new Multiplication();

        System.out.println("Sum = "+addition.add(30, 50));
        System.out.println("Multiply = "+multiply.multi(6, 8));
    }
}