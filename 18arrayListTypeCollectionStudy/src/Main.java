import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();

        cities.add("Ankara");
        cities.add("İstanbul");
        cities.add("İzmir");
        cities.add("Aydın");

        cities.remove("İstanbul");
        Collections.sort(cities); //şehirleri sıralar

        for (String i : cities){
            System.out.println(i);
        }
    }
}
