import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(); // <String> vererek aslında tip güvenli bir generic yapı oluşturduk. Generics leri bu yüzden kullanıyoruz.

        cities.add("Ankara");
        cities.add("İstanbul");
//        cities.add(1); bu kodda ekrana hata basar çünkü biz <String> tipinde generic bir yapı oluşturduk.

        System.out.println(cities);
    }
}