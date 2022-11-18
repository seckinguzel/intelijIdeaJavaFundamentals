public class Main {

    public static void main(String[] args) {
        String message = "Today weather is so beautiful.";

        String newMessage = message.substring(0, 2); //Eger bu ifadeyi (String newMessage =) yazmazsam bellekte yeni bir ifade olusturur ama kullanmaz.
        System.out.println(newMessage);

        String secondMessage = showCity();
        System.out.println(secondMessage);

        int number = gather(15, 7);
        System.out.println(number);

        int summation = gather2(2, 3, 4, 5, 6, 10);
        System.out.println(summation);
    }

    public static void add() {
        System.out.println("Added");
    }

    public static void delete() {
        System.out.println("Deleted");
    }

    public static void update() {
        System.out.println("Updated");
    }

    public static int gather(int number1, int number2) {
        return number1 + number2;
    }

    public static String showCity() {
        return "Ankara";
    }

    public static int gather2(int... numbers) { //... 3 noktanin anlami variable arguements demek aslında arka planda yukarda eklenen sayilari diziye ceviriyor.
        int summation = 0;
        for (int i : numbers) {
            summation = summation + i;
        }
        return summation;
    }

}
