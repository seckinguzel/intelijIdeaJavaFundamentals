public class Main {

    public static void main(String[] args) {
        FourOperations fourOperations = new FourOperations();

        int number1 = 35;
        int number2 = 27;

        System.out.println(fourOperations.Gather(number1, number2));
        System.out.println(fourOperations.Subtract(number1, number2));
        System.out.println(fourOperations.Multiply(number1, number2));
        System.out.println(fourOperations.Divide(number1, number2));

    }
}
