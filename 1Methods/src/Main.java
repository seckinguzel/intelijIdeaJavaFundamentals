public class Main {

    public static void main(String[] args) {
        findingNumbers();
    }

    public static void findingNumbers() {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int search = 5;
        boolean isThere = false;

        for (int i : numbers) {
            if (i == search) {
                isThere = true;
                break;
            }
        }

        if (isThere) {
            showMessage("The number is available " + search);
        } else {
            showMessage("The number is not available " + search);
        }
    }

    public static void showMessage(String message) {
        System.out.println(message);
    }

}
