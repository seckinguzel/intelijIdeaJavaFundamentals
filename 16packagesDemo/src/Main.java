//java da built-in paketler vardır bu kızımda bunları import edeceğiz
import math.FourProcess;
import math.Logarithm;
import java.util.Scanner;
// import math.* diyerek tüm math class larına ulaşabilirim
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //şu an class ı oluşturduk

        System.out.println("Please enter your name!");

        String name = scanner.nextLine();

        System.out.println("Merhaba " + name);

        FourProcess fourProcess = new FourProcess();

        System.out.println(fourProcess.gather(2,3));

        Logarithm logarithm = new Logarithm();

        System.out.println(logarithm.calculateLogarithm());
    }
}
